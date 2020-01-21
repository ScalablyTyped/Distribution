package typings.jquerySortable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQuerySortable {
  type Dimensions = js.Array[scala.Double]
  type GenericEventHandler = js.Function4[
    /* $item */ js.UndefOr[typings.jquerySortable.JQuery], 
    /* container */ js.UndefOr[typings.jquerySortable.JQuerySortable.Container], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], 
    /* event */ js.UndefOr[typings.std.Event_], 
    scala.Unit
  ]
  type OnCancelHandler = js.Function4[
    /* $item */ js.UndefOr[typings.jquerySortable.JQuery], 
    /* container */ js.UndefOr[typings.jquerySortable.JQuerySortable.Container], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
    ], 
    /* event */ js.UndefOr[typings.std.Event_], 
    scala.Unit
  ]
  type OnDragEventHandler = js.Function4[
    /* $item */ js.UndefOr[typings.jquerySortable.JQuery], 
    /* position */ js.UndefOr[typings.jquerySortable.JQuerySortable.Position], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
    ], 
    /* event */ js.UndefOr[typings.std.Event_], 
    scala.Unit
  ]
  type OnMousedownHandler = js.Function3[
    /* $item */ js.UndefOr[typings.jquerySortable.JQuery], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
    ], 
    /* event */ js.UndefOr[typings.std.Event_], 
    scala.Unit
  ]
  // Deliberately typing $children as an any here as it makes it much easier to use. Actual type is JQuery | any[]
  type SerializeFunc = js.Function3[
    /* $parent */ typings.jquerySortable.JQuery, 
    /* $children */ js.Any, 
    /* parentIsContainer */ scala.Boolean, 
    scala.Unit
  ]
}
