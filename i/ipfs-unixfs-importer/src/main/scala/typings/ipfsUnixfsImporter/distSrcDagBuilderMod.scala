package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcChunkerMod.Chunker
import typings.ipfsUnixfsImporter.distSrcDagBuilderFileMod.FileBuilderOptions
import typings.ipfsUnixfsImporter.distSrcDagBuilderValidateChunksMod.ChunkValidator
import typings.ipfsUnixfsImporter.distSrcLayoutMod.Reducer
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.unixfsColonimporterColonprogressColonfileColonread
import typings.ipfsUnixfsImporter.mod.BufferImporterResult
import typings.ipfsUnixfsImporter.mod.File
import typings.ipfsUnixfsImporter.mod.ImportCandidate
import typings.ipfsUnixfsImporter.mod.InProgressImportResult
import typings.ipfsUnixfsImporter.mod.WritableStorage
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.progressEvents.mod.ProgressEvent
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultDagBuilder(options: DagBuilderOptions): DAGBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultDagBuilder")(options.asInstanceOf[js.Any]).asInstanceOf[DAGBuilder]
  
  type DAGBuilder = js.Function2[
    /* source */ ImporterSourceStream, 
    /* blockstore */ WritableStorage, 
    AsyncIterable[js.Function0[js.Promise[InProgressImportResult]]]
  ]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ipfsUnixfsImporter.distSrcDagBuilderDirMod.DirBuilderOptions because var conflicts: cidVersion, signal. Inlined  */ trait DagBuilderOptions
    extends StObject
       with FileBuilderOptions {
    
    def chunkValidator(source: AsyncIterable[js.typedarray.Uint8Array]): AsyncIterable[js.typedarray.Uint8Array]
    @JSName("chunkValidator")
    var chunkValidator_Original: ChunkValidator
    
    def chunker(source: AsyncIterable[js.typedarray.Uint8Array]): AsyncIterable[js.typedarray.Uint8Array]
    @JSName("chunker")
    var chunker_Original: Chunker
    
    var wrapWithDirectory: Boolean
  }
  object DagBuilderOptions {
    
    inline def apply(
      blockWriteConcurrency: Double,
      bufferImporter: (/* file */ File, /* blockstore */ WritableStorage) => AsyncIterable[js.Function0[js.Promise[BufferImporterResult]]],
      chunkValidator: /* source */ AsyncIterable[js.typedarray.Uint8Array] => AsyncIterable[js.typedarray.Uint8Array],
      chunker: /* source */ AsyncIterable[js.typedarray.Uint8Array] => AsyncIterable[js.typedarray.Uint8Array],
      cidVersion: Version,
      layout: (/* source */ AsyncIterable[InProgressImportResult] | js.Iterable[InProgressImportResult], /* reducer */ Reducer) => js.Promise[InProgressImportResult],
      reduceSingleLeafToSelf: Boolean,
      wrapWithDirectory: Boolean
    ): DagBuilderOptions = {
      val __obj = js.Dynamic.literal(blockWriteConcurrency = blockWriteConcurrency.asInstanceOf[js.Any], bufferImporter = js.Any.fromFunction2(bufferImporter), chunkValidator = js.Any.fromFunction1(chunkValidator), chunker = js.Any.fromFunction1(chunker), cidVersion = cidVersion.asInstanceOf[js.Any], layout = js.Any.fromFunction2(layout), reduceSingleLeafToSelf = reduceSingleLeafToSelf.asInstanceOf[js.Any], wrapWithDirectory = wrapWithDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[DagBuilderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DagBuilderOptions] (val x: Self) extends AnyVal {
      
      inline def setChunkValidator(
        value: /* source */ AsyncIterable[js.typedarray.Uint8Array] => AsyncIterable[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "chunkValidator", js.Any.fromFunction1(value))
      
      inline def setChunker(
        value: /* source */ AsyncIterable[js.typedarray.Uint8Array] => AsyncIterable[js.typedarray.Uint8Array]
      ): Self = StObject.set(x, "chunker", js.Any.fromFunction1(value))
      
      inline def setWrapWithDirectory(value: Boolean): Self = StObject.set(x, "wrapWithDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  type DagBuilderProgressEvents = ProgressEvent[unixfsColonimporterColonprogressColonfileColonread, ImportReadProgress]
  
  trait ImportReadProgress extends StObject {
    
    /**
      * How many bytes we have read from this source so far
      */
    var bytesRead: js.BigInt
    
    /**
      * The size of the current chunk
      */
    var chunkSize: js.BigInt
    
    /**
      * The path of the file being imported, if one was specified
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object ImportReadProgress {
    
    inline def apply(bytesRead: js.BigInt, chunkSize: js.BigInt): ImportReadProgress = {
      val __obj = js.Dynamic.literal(bytesRead = bytesRead.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportReadProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportReadProgress] (val x: Self) extends AnyVal {
      
      inline def setBytesRead(value: js.BigInt): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
      
      inline def setChunkSize(value: js.BigInt): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type ImporterSourceStream = AsyncIterable[ImportCandidate] | js.Iterable[ImportCandidate]
}
