package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s name.
  */
@js.native
trait SchemaName extends StObject {
  
  /**
    * The read-only display name formatted according to the locale specified by
    * the viewer&#39;s account or the &lt;code&gt;Accept-Language&lt;/code&gt;
    * HTTP header.
    */
  var displayName: js.UndefOr[String] = js.native
}
object SchemaName {
  
  @scala.inline
  def apply(): SchemaName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaName]
  }
  
  @scala.inline
  implicit class SchemaNameMutableBuilder[Self <: SchemaName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
