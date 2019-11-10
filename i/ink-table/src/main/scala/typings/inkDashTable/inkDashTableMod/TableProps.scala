package typings.inkDashTable.inkDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var cell: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InkComponent */ js.Any
  ] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var header: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InkComponent */ js.Any
  ] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var skeleton: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InkComponent */ js.Any
  ] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    cell: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InkComponent */ js.Any = null,
    data: js.Array[js.Object] = null,
    header: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InkComponent */ js.Any = null,
    padding: Int | Double = null,
    skeleton: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify InkComponent */ js.Any = null
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (data != null) __obj.updateDynamic("data")(data)
    if (header != null) __obj.updateDynamic("header")(header)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (skeleton != null) __obj.updateDynamic("skeleton")(skeleton)
    __obj.asInstanceOf[TableProps]
  }
}

