package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.distSrcLayoutMod.FileLayout
import typings.ipfsUnixfsImporter.distSrcLayoutMod.Reducer
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.unixfsColonimporterColonprogressColonfileColonlayout
import typings.ipfsUnixfsImporter.mod.BufferImporter
import typings.ipfsUnixfsImporter.mod.BufferImporterResult
import typings.ipfsUnixfsImporter.mod.File
import typings.ipfsUnixfsImporter.mod.ImporterProgressEvents
import typings.ipfsUnixfsImporter.mod.InProgressImportResult
import typings.ipfsUnixfsImporter.mod.WritableStorage
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.progressEvents.mod.ProgressEvent
import typings.progressEvents.mod.ProgressOptions
import typings.std.AbortSignal
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderFileMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileBuilder(file: File, block: WritableStorage, options: FileBuilderOptions): js.Promise[InProgressImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileBuilder")(file.asInstanceOf[js.Any], block.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[InProgressImportResult]]
  
  trait BuildFileBatchOptions extends StObject {
    
    var blockWriteConcurrency: Double
    
    def bufferImporter(file: File, blockstore: WritableStorage): AsyncIterable[js.Function0[js.Promise[BufferImporterResult]]]
    @JSName("bufferImporter")
    var bufferImporter_Original: BufferImporter
  }
  object BuildFileBatchOptions {
    
    inline def apply(
      blockWriteConcurrency: Double,
      bufferImporter: (/* file */ File, /* blockstore */ WritableStorage) => AsyncIterable[js.Function0[js.Promise[BufferImporterResult]]]
    ): BuildFileBatchOptions = {
      val __obj = js.Dynamic.literal(blockWriteConcurrency = blockWriteConcurrency.asInstanceOf[js.Any], bufferImporter = js.Any.fromFunction2(bufferImporter))
      __obj.asInstanceOf[BuildFileBatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildFileBatchOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockWriteConcurrency(value: Double): Self = StObject.set(x, "blockWriteConcurrency", value.asInstanceOf[js.Any])
      
      inline def setBufferImporter(
        value: (/* file */ File, /* blockstore */ WritableStorage) => AsyncIterable[js.Function0[js.Promise[BufferImporterResult]]]
      ): Self = StObject.set(x, "bufferImporter", js.Any.fromFunction2(value))
    }
  }
  
  trait FileBuilderOptions
    extends StObject
       with BuildFileBatchOptions
       with ReduceOptions {
    
    def layout(source: js.Iterable[InProgressImportResult], reducer: Reducer): js.Promise[InProgressImportResult]
    def layout(source: AsyncIterable[InProgressImportResult], reducer: Reducer): js.Promise[InProgressImportResult]
    @JSName("layout")
    var layout_Original: FileLayout
  }
  object FileBuilderOptions {
    
    inline def apply(
      blockWriteConcurrency: Double,
      bufferImporter: (/* file */ File, /* blockstore */ WritableStorage) => AsyncIterable[js.Function0[js.Promise[BufferImporterResult]]],
      cidVersion: Version,
      layout: (/* source */ AsyncIterable[InProgressImportResult] | js.Iterable[InProgressImportResult], /* reducer */ Reducer) => js.Promise[InProgressImportResult],
      reduceSingleLeafToSelf: Boolean
    ): FileBuilderOptions = {
      val __obj = js.Dynamic.literal(blockWriteConcurrency = blockWriteConcurrency.asInstanceOf[js.Any], bufferImporter = js.Any.fromFunction2(bufferImporter), cidVersion = cidVersion.asInstanceOf[js.Any], layout = js.Any.fromFunction2(layout), reduceSingleLeafToSelf = reduceSingleLeafToSelf.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileBuilderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileBuilderOptions] (val x: Self) extends AnyVal {
      
      inline def setLayout(
        value: (/* source */ AsyncIterable[InProgressImportResult] | js.Iterable[InProgressImportResult], /* reducer */ Reducer) => js.Promise[InProgressImportResult]
      ): Self = StObject.set(x, "layout", js.Any.fromFunction2(value))
    }
  }
  
  trait LayoutLeafProgress extends StObject {
    
    /**
      * The CID of the leaf being written
      */
    var cid: CID[Any, Double, Double, Version]
    
    /**
      * The path of the file being imported, if one was specified
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object LayoutLeafProgress {
    
    inline def apply(cid: CID[Any, Double, Double, Version]): LayoutLeafProgress = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutLeafProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutLeafProgress] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait ReduceOptions
    extends StObject
       with ProgressOptions[ImporterProgressEvents] {
    
    var cidVersion: Version
    
    var reduceSingleLeafToSelf: Boolean
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object ReduceOptions {
    
    inline def apply(cidVersion: Version, reduceSingleLeafToSelf: Boolean): ReduceOptions = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], reduceSingleLeafToSelf = reduceSingleLeafToSelf.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReduceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReduceOptions] (val x: Self) extends AnyVal {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setReduceSingleLeafToSelf(value: Boolean): Self = StObject.set(x, "reduceSingleLeafToSelf", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  type ReducerProgressEvents = ProgressEvent[unixfsColonimporterColonprogressColonfileColonlayout, LayoutLeafProgress]
}
