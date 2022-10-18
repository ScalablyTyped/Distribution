package typings.itTar

import typings.itStreamTypes.mod.Source
import typings.itStreamTypes.mod.Transform
import typings.itTar.anon.PartialTarEntryHeadername
import typings.std.AsyncIterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-tar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extract(): Transform[js.typedarray.Uint8Array, TarEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")().asInstanceOf[Transform[js.typedarray.Uint8Array, TarEntry]]
  inline def extract(options: typings.itTar.distSrcExtractMod.ExtractOptions): Transform[js.typedarray.Uint8Array, TarEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[Transform[js.typedarray.Uint8Array, TarEntry]]
  
  inline def pack(): Transform[TarImportCandidate, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")().asInstanceOf[Transform[TarImportCandidate, js.typedarray.Uint8Array]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.itTar.itTarStrings.file
    - typings.itTar.itTarStrings.link
    - typings.itTar.itTarStrings.symlink
    - typings.itTar.itTarStrings.`character-device`
    - typings.itTar.itTarStrings.`block-device`
    - typings.itTar.itTarStrings.directory
    - typings.itTar.itTarStrings.fifo
    - typings.itTar.itTarStrings.`contiguous-file`
    - typings.itTar.itTarStrings.`pax-header`
    - typings.itTar.itTarStrings.`pax-global-header`
    - typings.itTar.itTarStrings.`gnu-long-link-path`
    - typings.itTar.itTarStrings.`gnu-long-path`
  */
  trait EntryType extends StObject
  object EntryType {
    
    inline def `block-device`: typings.itTar.itTarStrings.`block-device` = "block-device".asInstanceOf[typings.itTar.itTarStrings.`block-device`]
    
    inline def `character-device`: typings.itTar.itTarStrings.`character-device` = "character-device".asInstanceOf[typings.itTar.itTarStrings.`character-device`]
    
    inline def `contiguous-file`: typings.itTar.itTarStrings.`contiguous-file` = "contiguous-file".asInstanceOf[typings.itTar.itTarStrings.`contiguous-file`]
    
    inline def directory: typings.itTar.itTarStrings.directory = "directory".asInstanceOf[typings.itTar.itTarStrings.directory]
    
    inline def fifo: typings.itTar.itTarStrings.fifo = "fifo".asInstanceOf[typings.itTar.itTarStrings.fifo]
    
    inline def file: typings.itTar.itTarStrings.file = "file".asInstanceOf[typings.itTar.itTarStrings.file]
    
    inline def `gnu-long-link-path`: typings.itTar.itTarStrings.`gnu-long-link-path` = "gnu-long-link-path".asInstanceOf[typings.itTar.itTarStrings.`gnu-long-link-path`]
    
    inline def `gnu-long-path`: typings.itTar.itTarStrings.`gnu-long-path` = "gnu-long-path".asInstanceOf[typings.itTar.itTarStrings.`gnu-long-path`]
    
    inline def link: typings.itTar.itTarStrings.link = "link".asInstanceOf[typings.itTar.itTarStrings.link]
    
    inline def `pax-global-header`: typings.itTar.itTarStrings.`pax-global-header` = "pax-global-header".asInstanceOf[typings.itTar.itTarStrings.`pax-global-header`]
    
    inline def `pax-header`: typings.itTar.itTarStrings.`pax-header` = "pax-header".asInstanceOf[typings.itTar.itTarStrings.`pax-header`]
    
    inline def symlink: typings.itTar.itTarStrings.symlink = "symlink".asInstanceOf[typings.itTar.itTarStrings.symlink]
  }
  
  trait ExtractOptions extends StObject {
    
    var filenameEncoding: String
    
    var highWaterMark: Double
  }
  object ExtractOptions {
    
    inline def apply(filenameEncoding: String, highWaterMark: Double): ExtractOptions = {
      val __obj = js.Dynamic.literal(filenameEncoding = filenameEncoding.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractOptions]
    }
    
    extension [Self <: ExtractOptions](x: Self) {
      
      inline def setFilenameEncoding(value: String): Self = StObject.set(x, "filenameEncoding", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    }
  }
  
  trait TarEntry extends StObject {
    
    var body: AsyncIterable[js.typedarray.Uint8Array]
    
    var header: TarEntryHeader
  }
  object TarEntry {
    
    inline def apply(body: AsyncIterable[js.typedarray.Uint8Array], header: TarEntryHeader): TarEntry = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[TarEntry]
    }
    
    extension [Self <: TarEntry](x: Self) {
      
      inline def setBody(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: TarEntryHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait TarEntryHeader extends StObject {
    
    var devmajor: js.UndefOr[Double] = js.undefined
    
    var devminor: js.UndefOr[Double] = js.undefined
    
    var gid: Double
    
    var gname: js.UndefOr[String] = js.undefined
    
    var linkname: js.UndefOr[String] = js.undefined
    
    var mode: Double
    
    var mtime: js.Date
    
    var name: String
    
    var pax: js.UndefOr[Record[String, String]] = js.undefined
    
    var size: Double
    
    var `type`: js.UndefOr[EntryType] = js.undefined
    
    var typeflag: js.UndefOr[Double] = js.undefined
    
    var uid: Double
    
    var uname: js.UndefOr[String] = js.undefined
  }
  object TarEntryHeader {
    
    inline def apply(gid: Double, mode: Double, mtime: js.Date, name: String, size: Double, uid: Double): TarEntryHeader = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TarEntryHeader]
    }
    
    extension [Self <: TarEntryHeader](x: Self) {
      
      inline def setDevmajor(value: Double): Self = StObject.set(x, "devmajor", value.asInstanceOf[js.Any])
      
      inline def setDevmajorUndefined: Self = StObject.set(x, "devmajor", js.undefined)
      
      inline def setDevminor(value: Double): Self = StObject.set(x, "devminor", value.asInstanceOf[js.Any])
      
      inline def setDevminorUndefined: Self = StObject.set(x, "devminor", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGname(value: String): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      inline def setGnameUndefined: Self = StObject.set(x, "gname", js.undefined)
      
      inline def setLinkname(value: String): Self = StObject.set(x, "linkname", value.asInstanceOf[js.Any])
      
      inline def setLinknameUndefined: Self = StObject.set(x, "linkname", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPax(value: Record[String, String]): Self = StObject.set(x, "pax", value.asInstanceOf[js.Any])
      
      inline def setPaxUndefined: Self = StObject.set(x, "pax", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: EntryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeflag(value: Double): Self = StObject.set(x, "typeflag", value.asInstanceOf[js.Any])
      
      inline def setTypeflagUndefined: Self = StObject.set(x, "typeflag", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      inline def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
    }
  }
  
  trait TarImportCandidate extends StObject {
    
    var body: js.UndefOr[Source[js.typedarray.Uint8Array] | js.typedarray.Uint8Array] = js.undefined
    
    var header: PartialTarEntryHeadername
  }
  object TarImportCandidate {
    
    inline def apply(header: PartialTarEntryHeadername): TarImportCandidate = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[TarImportCandidate]
    }
    
    extension [Self <: TarImportCandidate](x: Self) {
      
      inline def setBody(value: Source[js.typedarray.Uint8Array] | js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeader(value: PartialTarEntryHeadername): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
}
