package typings.jqueryui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JQueryUI {
  type AccordionEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.AccordionUIParams, 
    scala.Unit
  ]
  type AutocompleteEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.AutocompleteUIParams, 
    scala.Unit
  ]
  type DialogEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.DialogUIParams, 
    scala.Unit
  ]
  type DraggableEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.DraggableEventUIParams, 
    scala.Unit
  ]
  type DroppableEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.DroppableEventUIParam, 
    scala.Unit
  ]
  type MenuEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.MenuUIParams, 
    scala.Unit
  ]
  type ProgressbarEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.ProgressbarUIParams, 
    scala.Unit
  ]
  type ResizableEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.ResizableUIParams, 
    scala.Unit
  ]
  type SelectMenuEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.SelectMenuUIParams, 
    scala.Unit
  ]
  type SliderEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.SliderUIParams, 
    scala.Unit
  ]
  type SortableEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.SortableUIParams, 
    scala.Unit
  ]
  type SpinnerEvent[T] = js.Function2[/* event */ typings.jquery.JQueryEventObject, /* ui */ T, scala.Unit]
  type TabsEvent[UI] = js.Function2[/* event */ typings.jquery.JQueryEventObject, /* ui */ UI, scala.Unit]
  type TooltipEvent = js.Function2[
    /* event */ typings.jquery.JQueryEventObject, 
    /* ui */ typings.jqueryui.JQueryUI.TooltipUIParams, 
    scala.Unit
  ]
}
