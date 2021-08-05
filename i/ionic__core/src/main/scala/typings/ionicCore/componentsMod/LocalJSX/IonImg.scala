package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonImg extends StObject {
  
  /**
    * This attribute defines the alternative text describing the image. Users will see this text displayed if the image URL is wrong, the image is not in one of the supported formats, or if the image is not yet downloaded.
    */
  var alt: js.UndefOr[String] = js.undefined
  
  /**
    * Emitted when the img fails to load
    */
  var onIonError: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the image has finished loading
    */
  var onIonImgDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the img src has been set
    */
  var onIonImgWillLoad: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * The image URL. This attribute is mandatory for the `<img>` element.
    */
  var src: js.UndefOr[String] = js.undefined
}
object IonImg {
  
  inline def apply(): IonImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonImg]
  }
  
  extension [Self <: IonImg](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setOnIonError(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonError", js.Any.fromFunction1(value))
    
    inline def setOnIonErrorUndefined: Self = StObject.set(x, "onIonError", js.undefined)
    
    inline def setOnIonImgDidLoad(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonImgDidLoad", js.Any.fromFunction1(value))
    
    inline def setOnIonImgDidLoadUndefined: Self = StObject.set(x, "onIonImgDidLoad", js.undefined)
    
    inline def setOnIonImgWillLoad(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonImgWillLoad", js.Any.fromFunction1(value))
    
    inline def setOnIonImgWillLoadUndefined: Self = StObject.set(x, "onIonImgWillLoad", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
