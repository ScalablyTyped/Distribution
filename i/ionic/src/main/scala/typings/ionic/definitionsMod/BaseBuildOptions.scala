package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBuildOptions extends StObject {
  
  var `--`: js.Array[String] = js.native
  
  var engine: String = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var project: js.UndefOr[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object BaseBuildOptions {
  
  @scala.inline
  def apply(`--`: js.Array[String], engine: String): BaseBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBuildOptions]
  }
  
  @scala.inline
  implicit class BaseBuildOptionsMutableBuilder[Self <: BaseBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set--`(value: js.Array[String]): Self = StObject.set(x, "--", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set--Varargs`(value: String*): Self = StObject.set(x, "--", js.Array(value :_*))
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
