package typings.jqueryui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryUI {
  import typings.jquery.JQueryEventObject
  import typings.std.Event

  type AccordionEvent = js.Function2[/* event */ Event, /* ui */ AccordionUIParams, Unit]
  type AutocompleteEvent = js.Function2[/* event */ Event, /* ui */ AutocompleteUIParams, Unit]
  type DialogEvent = js.Function2[/* event */ Event, /* ui */ DialogUIParams, Unit]
  type DraggableEvent = js.Function2[/* event */ Event, /* ui */ DraggableEventUIParams, Unit]
  type DroppableEvent = js.Function2[/* event */ Event, /* ui */ DroppableEventUIParam, Unit]
  type MenuEvent = js.Function2[/* event */ Event, /* ui */ MenuUIParams, Unit]
  type ProgressbarEvent = js.Function2[/* event */ Event, /* ui */ ProgressbarUIParams, Unit]
  type ResizableEvent = js.Function2[/* event */ Event, /* ui */ ResizableUIParams, Unit]
  type SelectMenuEvent = js.Function2[/* event */ Event, /* ui */ SelectMenuUIParams, Unit]
  type SliderEvent = js.Function2[/* event */ Event, /* ui */ SliderUIParams, Unit]
  type SortableEvent = js.Function2[/* event */ JQueryEventObject, /* ui */ SortableUIParams, Unit]
  type SpinnerEvent[T] = js.Function2[/* event */ Event, /* ui */ T, Unit]
  type TabsEvent[UI] = js.Function2[/* event */ Event, /* ui */ UI, Unit]
  type TooltipEvent = js.Function2[/* event */ Event, /* ui */ TooltipUIParams, Unit]
}
