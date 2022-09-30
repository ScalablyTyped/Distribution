package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsFileMod {
  
  object global {
    
    inline def saveAs(data: Any, filename: String, dataType: String): Unit = (js.Dynamic.global.applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], dataType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Save data to file with given filename, using IITCm file chooser, or generic browser routine.
      * `dataType` can be set to filter IITCm file chooser filetypes.
      */
    inline def saveFile(data: String): Unit = js.Dynamic.global.applyDynamic("saveFile")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def saveFile(data: String, filename: String): Unit = (js.Dynamic.global.applyDynamic("saveFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveFile(data: String, filename: String, dataType: String): Unit = (js.Dynamic.global.applyDynamic("saveFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], dataType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveFile(data: String, filename: Unit, dataType: String): Unit = (js.Dynamic.global.applyDynamic("saveFile")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], dataType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
