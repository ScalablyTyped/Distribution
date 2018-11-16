package typings
package jqueryuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryUINs {
  type AccordionEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AccordionUIParams, scala.Unit]
  type AutocompleteEvent = js.Function2[/* event */ stdLib.Event, /* ui */ AutocompleteUIParams, scala.Unit]
  type DialogEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DialogUIParams, scala.Unit]
  type DraggableEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DraggableEventUIParams, scala.Unit]
  type DroppableEvent = js.Function2[/* event */ stdLib.Event, /* ui */ DroppableEventUIParam, scala.Unit]
  type MenuEvent = js.Function2[/* event */ stdLib.Event, /* ui */ MenuUIParams, scala.Unit]
  type ProgressbarEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ProgressbarUIParams, scala.Unit]
  type ResizableEvent = js.Function2[/* event */ stdLib.Event, /* ui */ ResizableUIParams, scala.Unit]
  type SelectMenuEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SelectMenuUIParams, scala.Unit]
  type SliderEvent = js.Function2[/* event */ stdLib.Event, /* ui */ SliderUIParams, scala.Unit]
  type SortableEvent = js.Function2[/* event */ jqueryLib.JQueryEventObject, /* ui */ SortableUIParams, scala.Unit]
  type SpinnerEvent[T] = js.Function2[/* event */ stdLib.Event, /* ui */ T, scala.Unit]
  type TabsEvent[UI] = js.Function2[/* event */ stdLib.Event, /* ui */ UI, scala.Unit]
  type TooltipEvent = js.Function2[/* event */ stdLib.Event, /* ui */ TooltipUIParams, scala.Unit]
}
