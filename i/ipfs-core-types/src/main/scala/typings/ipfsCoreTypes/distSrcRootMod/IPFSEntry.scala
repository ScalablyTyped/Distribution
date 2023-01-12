package typings.ipfsCoreTypes.distSrcRootMod

import typings.ipfsCoreTypes.ipfsCoreTypesStrings.dir
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.file
import typings.ipfsUnixfs.mod.Mtime
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPFSEntry extends StObject {
  
  val cid: CID[Any, Double, Double, Version]
  
  var mode: js.UndefOr[Double] = js.undefined
  
  var mtime: js.UndefOr[Mtime] = js.undefined
  
  val name: String
  
  val path: String
  
  var size: Double
  
  val `type`: dir | file
}
object IPFSEntry {
  
  inline def apply(
    cid: CID[Any, Double, Double, Version],
    name: String,
    path: String,
    size: Double,
    `type`: dir | file
  ): IPFSEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPFSEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPFSEntry] (val x: Self) extends AnyVal {
    
    inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: dir | file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
