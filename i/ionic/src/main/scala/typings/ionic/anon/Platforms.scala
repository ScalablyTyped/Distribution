package typings.ionic.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Platforms extends StObject {
  
  var platforms: js.Array[String] = js.native
  
  var plugins: StringDictionary[js.Any] = js.native
}
object Platforms {
  
  @scala.inline
  def apply(platforms: js.Array[String], plugins: StringDictionary[js.Any]): Platforms = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platforms]
  }
  
  @scala.inline
  implicit class PlatformsMutableBuilder[Self <: Platforms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: StringDictionary[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
