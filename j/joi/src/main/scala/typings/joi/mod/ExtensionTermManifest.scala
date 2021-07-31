package typings.joi.mod

import typings.joi.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionTermManifest extends StObject {
  
  var mapped: From
}
object ExtensionTermManifest {
  
  @scala.inline
  def apply(mapped: From): ExtensionTermManifest = {
    val __obj = js.Dynamic.literal(mapped = mapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTermManifest]
  }
  
  @scala.inline
  implicit class ExtensionTermManifestMutableBuilder[Self <: ExtensionTermManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapped(value: From): Self = StObject.set(x, "mapped", value.asInstanceOf[js.Any])
  }
}
