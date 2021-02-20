package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonImg extends StObject {
  
  /**
    * This attribute defines the alternative text describing the image. Users will see this text displayed if the image URL is wrong, the image is not in one of the supported formats, or if the image is not yet downloaded.
    */
  var alt: js.UndefOr[String] = js.native
  
  /**
    * Emitted when the img fails to load
    */
  var onIonError: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted when the image has finished loading
    */
  var onIonImgDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Emitted when the img src has been set
    */
  var onIonImgWillLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * The image URL. This attribute is mandatory for the `<img>` element.
    */
  var src: js.UndefOr[String] = js.native
}
object IonImg {
  
  @scala.inline
  def apply(): IonImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonImg]
  }
  
  @scala.inline
  implicit class IonImgMutableBuilder[Self <: IonImg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setOnIonError(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonErrorUndefined: Self = StObject.set(x, "onIonError", js.undefined)
    
    @scala.inline
    def setOnIonImgDidLoad(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonImgDidLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonImgDidLoadUndefined: Self = StObject.set(x, "onIonImgDidLoad", js.undefined)
    
    @scala.inline
    def setOnIonImgWillLoad(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonImgWillLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonImgWillLoadUndefined: Self = StObject.set(x, "onIonImgWillLoad", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
