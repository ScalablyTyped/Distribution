package typings.jqueryui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryUI {
  import typings.jquery.JQueryEventObject

  type AccordionEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ AccordionUIParams, Unit]
  type AutocompleteEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams, Unit]
  type DialogEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ DialogUIParams, Unit]
  type DraggableEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ DraggableEventUIParams, Unit]
  type DroppableEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam, Unit]
  type MenuEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ MenuUIParams, Unit]
  type ProgressbarEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams, Unit]
  type ResizableEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ ResizableUIParams, Unit]
  type SelectMenuEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams, Unit]
  type SliderEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ SliderUIParams, Unit]
  type SortableEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ SortableUIParams, Unit]
  type SpinnerEvent[T] = js.Function2[/* event */ JQueryEventObject, /* ui */ T, Unit]
  type TabsEvent[UI] = js.Function2[/* event */ JQueryEventObject, /* ui */ UI, Unit]
  type TooltipEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ TooltipUIParams, Unit]
}
