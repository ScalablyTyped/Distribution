package typings.heremaps.H.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface to specify a copyright note
  * @property label {string} - A short textual representation of the copyright note, e.g. "DigitalGlobe 2009"
  * @property alt {string} - A detailed textual representation of the copyright note, e.g. "copyright 2009 DigitalGlobe, Inc."
  */
@js.native
trait ICopyright extends StObject {
  
  var alt: String = js.native
  
  var label: String = js.native
}
object ICopyright {
  
  @scala.inline
  def apply(alt: String, label: String): ICopyright = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyright]
  }
  
  @scala.inline
  implicit class ICopyrightMutableBuilder[Self <: ICopyright] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
