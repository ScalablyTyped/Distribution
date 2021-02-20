package typings.lokijs

import typings.lokijs.lokijsStrings.BROWSER
import typings.lokijs.lokijsStrings.CORDOVA
import typings.lokijs.lokijsStrings.NA
import typings.lokijs.lokijsStrings.NATIVESCRIPT
import typings.lokijs.lokijsStrings.NODEJS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LokiConstructorOptions extends StObject {
  
  var env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA = js.native
  
  var verbose: Boolean = js.native
}
object LokiConstructorOptions {
  
  @scala.inline
  def apply(env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA, verbose: Boolean): LokiConstructorOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiConstructorOptions]
  }
  
  @scala.inline
  implicit class LokiConstructorOptionsMutableBuilder[Self <: LokiConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
