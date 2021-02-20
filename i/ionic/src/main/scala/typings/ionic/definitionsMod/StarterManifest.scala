package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StarterManifest extends StObject {
  
  var baseref: String = js.native
  
  var name: String = js.native
  
  var welcome: js.UndefOr[String] = js.native
}
object StarterManifest {
  
  @scala.inline
  def apply(baseref: String, name: String): StarterManifest = {
    val __obj = js.Dynamic.literal(baseref = baseref.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterManifest]
  }
  
  @scala.inline
  implicit class StarterManifestMutableBuilder[Self <: StarterManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseref(value: String): Self = StObject.set(x, "baseref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcome(value: String): Self = StObject.set(x, "welcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWelcomeUndefined: Self = StObject.set(x, "welcome", js.undefined)
  }
}
