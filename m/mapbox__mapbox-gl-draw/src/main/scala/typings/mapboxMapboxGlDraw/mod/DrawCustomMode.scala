package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.GeoJSON
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawCustomMode[CustomModeState, CustomModeOptions] extends StObject {
  
  var onClick: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapMouseEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onCombineFeature: js.UndefOr[
    js.ThisFunction1[/* this */ DrawCustomModeThis & this.type, /* state */ CustomModeState, Unit]
  ] = js.undefined
  
  var onDrag: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapMouseEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onKeyDown: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ KeyboardEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onKeyUp: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ KeyboardEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onMouseDown: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapMouseEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onMouseMove: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapMouseEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onMouseOut: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapMouseEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onMouseUp: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapMouseEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onSetup: js.UndefOr[
    js.ThisFunction1[
      /* this */ DrawCustomModeThis & this.type, 
      /* options */ CustomModeOptions, 
      CustomModeState
    ]
  ] = js.undefined
  
  var onStop: js.UndefOr[
    js.ThisFunction1[/* this */ DrawCustomModeThis & this.type, /* state */ CustomModeState, Unit]
  ] = js.undefined
  
  var onTap: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapTouchEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onTouchEnd: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapTouchEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onTouchMove: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapTouchEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onTouchStart: js.UndefOr[
    js.ThisFunction2[
      /* this */ DrawCustomModeThis & this.type, 
      /* state */ CustomModeState, 
      /* e */ MapTouchEvent, 
      Unit
    ]
  ] = js.undefined
  
  var onTrash: js.UndefOr[
    js.ThisFunction1[/* this */ DrawCustomModeThis & this.type, /* state */ CustomModeState, Unit]
  ] = js.undefined
  
  var onUncombineFeature: js.UndefOr[
    js.ThisFunction1[/* this */ DrawCustomModeThis & this.type, /* state */ CustomModeState, Unit]
  ] = js.undefined
  
  def toDisplayFeatures(state: CustomModeState, geojson: GeoJSON, display: js.Function1[/* geojson */ GeoJSON, Unit]): Unit
}
object DrawCustomMode {
  
  inline def apply[CustomModeState, CustomModeOptions](toDisplayFeatures: (CustomModeState, GeoJSON, js.Function1[/* geojson */ GeoJSON, Unit]) => Unit): DrawCustomMode[CustomModeState, CustomModeOptions] = {
    val __obj = js.Dynamic.literal(toDisplayFeatures = js.Any.fromFunction3(toDisplayFeatures))
    __obj.asInstanceOf[DrawCustomMode[CustomModeState, CustomModeOptions]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawCustomMode[?, ?], CustomModeState, CustomModeOptions] (val x: Self & (DrawCustomMode[CustomModeState, CustomModeOptions])) extends AnyVal {
    
    inline def setOnClick(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapMouseEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCombineFeature(
      value: js.ThisFunction1[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          Unit
        ]
    ): Self = StObject.set(x, "onCombineFeature", value.asInstanceOf[js.Any])
    
    inline def setOnCombineFeatureUndefined: Self = StObject.set(x, "onCombineFeature", js.undefined)
    
    inline def setOnDrag(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapMouseEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnKeyDown(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ KeyboardEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ KeyboardEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnMouseDown(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapMouseEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseMove(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapMouseEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapMouseEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseUp(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapMouseEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnSetup(
      value: js.ThisFunction1[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* options */ CustomModeOptions, 
          CustomModeState
        ]
    ): Self = StObject.set(x, "onSetup", value.asInstanceOf[js.Any])
    
    inline def setOnSetupUndefined: Self = StObject.set(x, "onSetup", js.undefined)
    
    inline def setOnStop(
      value: js.ThisFunction1[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          Unit
        ]
    ): Self = StObject.set(x, "onStop", value.asInstanceOf[js.Any])
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    inline def setOnTap(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapTouchEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onTap", value.asInstanceOf[js.Any])
    
    inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    
    inline def setOnTouchEnd(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapTouchEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapTouchEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(
      value: js.ThisFunction2[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          /* e */ MapTouchEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTrash(
      value: js.ThisFunction1[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          Unit
        ]
    ): Self = StObject.set(x, "onTrash", value.asInstanceOf[js.Any])
    
    inline def setOnTrashUndefined: Self = StObject.set(x, "onTrash", js.undefined)
    
    inline def setOnUncombineFeature(
      value: js.ThisFunction1[
          /* this */ DrawCustomModeThis & (DrawCustomMode[CustomModeState, CustomModeOptions]), 
          /* state */ CustomModeState, 
          Unit
        ]
    ): Self = StObject.set(x, "onUncombineFeature", value.asInstanceOf[js.Any])
    
    inline def setOnUncombineFeatureUndefined: Self = StObject.set(x, "onUncombineFeature", js.undefined)
    
    inline def setToDisplayFeatures(value: (CustomModeState, GeoJSON, js.Function1[/* geojson */ GeoJSON, Unit]) => Unit): Self = StObject.set(x, "toDisplayFeatures", js.Any.fromFunction3(value))
  }
}
