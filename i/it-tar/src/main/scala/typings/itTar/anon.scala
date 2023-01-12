package typings.itTar

import typings.itTar.mod.EntryType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<it-tar.it-tar.TarEntryHeader> & {  name :string} */
  trait PartialTarEntryHeadername extends StObject {
    
    var devmajor: js.UndefOr[Double] = js.undefined
    
    var devminor: js.UndefOr[Double] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var gname: js.UndefOr[String] = js.undefined
    
    var linkname: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[js.Date] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pax: js.UndefOr[Record[String, String]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[EntryType] = js.undefined
    
    var typeflag: js.UndefOr[Double] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
    
    var uname: js.UndefOr[String] = js.undefined
  }
  object PartialTarEntryHeadername {
    
    inline def apply(): PartialTarEntryHeadername = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTarEntryHeadername]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTarEntryHeadername] (val x: Self) extends AnyVal {
      
      inline def setDevmajor(value: Double): Self = StObject.set(x, "devmajor", value.asInstanceOf[js.Any])
      
      inline def setDevmajorUndefined: Self = StObject.set(x, "devmajor", js.undefined)
      
      inline def setDevminor(value: Double): Self = StObject.set(x, "devminor", value.asInstanceOf[js.Any])
      
      inline def setDevminorUndefined: Self = StObject.set(x, "devminor", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setGname(value: String): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      inline def setGnameUndefined: Self = StObject.set(x, "gname", js.undefined)
      
      inline def setLinkname(value: String): Self = StObject.set(x, "linkname", value.asInstanceOf[js.Any])
      
      inline def setLinknameUndefined: Self = StObject.set(x, "linkname", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPax(value: Record[String, String]): Self = StObject.set(x, "pax", value.asInstanceOf[js.Any])
      
      inline def setPaxUndefined: Self = StObject.set(x, "pax", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: EntryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeflag(value: Double): Self = StObject.set(x, "typeflag", value.asInstanceOf[js.Any])
      
      inline def setTypeflagUndefined: Self = StObject.set(x, "typeflag", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      inline def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
    }
  }
}
