package typings.homeworks

import typings.homeworks.homeworksStrings.move
import typings.homeworks.homeworksStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homeworks {
  
  /**
    * @since 1.0.0
    */
  trait CheckboxOptions extends StObject
  
  /**
    * @since 1.0.0
    */
  trait ConverterOptions extends StObject
  
  /**
    * @since 1.0.0
    */
  trait DropdownOptions extends StObject
  
  /**
    * @since 1.0.44
    */
  trait Event extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var element: JQuery
    
    var value: String | js.Array[String] | Double
  }
  object Event {
    
    inline def apply(element: JQuery, value: String | js.Array[String] | Double): Event = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /**
    * @since 1.0.0
    */
  trait InputOptions extends StObject
  
  /**
    * @since 1.0.44
    */
  trait RippleEvent extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object RippleEvent {
    
    inline def apply(x: Double, y: Double): RippleEvent = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RippleEvent]
    }
    
    extension [Self <: RippleEvent](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @since 1.0.0
    */
  type RippleStartEventType = start
  
  /**
    * @since 1.0.0
    */
  trait SpinnerOptions extends StObject {
    
    var empty: js.UndefOr[js.Any] = js.undefined
    
    var `type`: js.UndefOr[js.Any] = js.undefined
  }
  object SpinnerOptions {
    
    inline def apply(): SpinnerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerOptions]
    }
    
    extension [Self <: SpinnerOptions](x: Self) {
      
      inline def setEmpty(value: js.Any): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * @since 1.0.44
    */
  trait StepEvent extends StObject {
    
    var header: js.Array[JQuery]
    
    var index: Double
    
    var length: Double
  }
  object StepEvent {
    
    inline def apply(header: js.Array[JQuery], index: Double, length: Double): StepEvent = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepEvent]
    }
    
    extension [Self <: StepEvent](x: Self) {
      
      inline def setHeader(value: js.Array[JQuery]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderVarargs(value: JQuery*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @since 1.0.0
    */
  type StepMoveEventType = move
  
  /**
    * @since 1.0.0
    */
  trait StepOptions extends StObject {
    
    var active: js.UndefOr[Double] = js.undefined
  }
  object StepOptions {
    
    inline def apply(): StepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepOptions]
    }
    
    extension [Self <: StepOptions](x: Self) {
      
      inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  /**
    * @since 1.0.44
    */
  trait TabEvent extends StObject {
    
    var header: js.Array[JQuery]
    
    var index: Double
    
    var length: Double
  }
  object TabEvent {
    
    inline def apply(header: js.Array[JQuery], index: Double, length: Double): TabEvent = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabEvent]
    }
    
    extension [Self <: TabEvent](x: Self) {
      
      inline def setHeader(value: js.Array[JQuery]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderVarargs(value: JQuery*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @since 1.0.0
    */
  type TabMoveEventType = move
  
  /**
    * @since 1.0.0
    */
  trait TabOptions extends StObject {
    
    var active: js.UndefOr[Double] = js.undefined
  }
  object TabOptions {
    
    inline def apply(): TabOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabOptions]
    }
    
    extension [Self <: TabOptions](x: Self) {
      
      inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  /**
    * @since 1.0.0
    */
  trait ToggleOptions extends StObject {
    
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object ToggleOptions {
    
    inline def apply(): ToggleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOptions]
    }
    
    extension [Self <: ToggleOptions](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  /**
    * @since 1.0.0
    */
  trait UploadOptions extends StObject {
    
    var beforeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var complete: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var dest: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[
        js.Function3[
          /* xhr */ js.UndefOr[js.Any], 
          /* state */ js.UndefOr[js.Any], 
          /* error */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    var extensions: js.UndefOr[js.Any] = js.undefined
    
    var isBtn: js.UndefOr[Boolean] = js.undefined
    
    var success: js.UndefOr[
        js.Function3[
          /* data */ js.UndefOr[js.Any], 
          /* state */ js.UndefOr[js.Any], 
          /* xhr */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object UploadOptions {
    
    inline def apply(url: String): UploadOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadOptions]
    }
    
    extension [Self <: UploadOptions](x: Self) {
      
      inline def setBeforeStart(value: () => Unit): Self = StObject.set(x, "beforeStart", js.Any.fromFunction0(value))
      
      inline def setBeforeStartUndefined: Self = StObject.set(x, "beforeStart", js.undefined)
      
      inline def setComplete(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setError(
        value: (/* xhr */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], /* error */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExtensions(value: js.Any): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setIsBtn(value: Boolean): Self = StObject.set(x, "isBtn", value.asInstanceOf[js.Any])
      
      inline def setIsBtnUndefined: Self = StObject.set(x, "isBtn", js.undefined)
      
      inline def setSuccess(
        value: (/* data */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], /* xhr */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
