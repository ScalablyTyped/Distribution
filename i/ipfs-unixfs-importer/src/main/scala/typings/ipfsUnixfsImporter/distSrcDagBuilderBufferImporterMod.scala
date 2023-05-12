package typings.ipfsUnixfsImporter

import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.file
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.raw
import typings.ipfsUnixfsImporter.ipfsUnixfsImporterStrings.unixfsColonimporterColonprogressColonfileColonwrite
import typings.ipfsUnixfsImporter.mod.BufferImporter
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.progressEvents.mod.ProgressEvent
import typings.progressEvents.mod.ProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDagBuilderBufferImporterMod {
  
  @JSImport("ipfs-unixfs-importer/dist/src/dag-builder/buffer-importer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultBufferImporter(options: BufferImporterOptions): BufferImporter = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultBufferImporter")(options.asInstanceOf[js.Any]).asInstanceOf[BufferImporter]
  
  type BufferImportProgressEvents = ProgressEvent[unixfsColonimporterColonprogressColonfileColonwrite, ImportWriteProgress]
  
  trait BufferImporterOptions
    extends StObject
       with ProgressOptions[BufferImportProgressEvents] {
    
    var cidVersion: Version
    
    var leafType: file | raw
    
    var rawLeaves: Boolean
  }
  object BufferImporterOptions {
    
    inline def apply(cidVersion: Version, leafType: file | raw, rawLeaves: Boolean): BufferImporterOptions = {
      val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], leafType = leafType.asInstanceOf[js.Any], rawLeaves = rawLeaves.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferImporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferImporterOptions] (val x: Self) extends AnyVal {
      
      inline def setCidVersion(value: Version): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
      
      inline def setLeafType(value: file | raw): Self = StObject.set(x, "leafType", value.asInstanceOf[js.Any])
      
      inline def setRawLeaves(value: Boolean): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportWriteProgress extends StObject {
    
    /**
      * How many bytes we have written for this source so far - this may be
      * bigger than the file size due to the DAG-PB wrappers of each block
      */
    var bytesWritten: js.BigInt
    
    /**
      * The CID of the block that has been written
      */
    var cid: CID[Any, Double, Double, Version]
    
    /**
      * The path of the file being imported, if one was specified
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object ImportWriteProgress {
    
    inline def apply(bytesWritten: js.BigInt, cid: CID[Any, Double, Double, Version]): ImportWriteProgress = {
      val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportWriteProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportWriteProgress] (val x: Self) extends AnyVal {
      
      inline def setBytesWritten(value: js.BigInt): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
