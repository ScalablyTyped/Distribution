package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.googleapisStrings.directory_v1
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: directory_v1
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "directory_v1")
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: directory_v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
