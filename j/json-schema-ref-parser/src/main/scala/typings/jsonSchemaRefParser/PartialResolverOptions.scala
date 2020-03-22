package typings.jsonSchemaRefParser

import typings.jsonSchemaRefParser.mod.FileInfo
import typings.node.Buffer
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<json-schema-ref-parser.json-schema-ref-parser.ResolverOptions> */
trait PartialResolverOptions extends js.Object {
  var canRead: js.UndefOr[
    Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
  ] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var read: js.UndefOr[
    js.Function2[
      /* file */ FileInfo, 
      /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]], 
      String | Buffer | (js.Promise[String | Buffer])
    ]
  ] = js.undefined
}

object PartialResolverOptions {
  @scala.inline
  def apply(
    canRead: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean]) = null,
    order: Int | Double = null,
    read: (/* file */ FileInfo, /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]]) => String | Buffer | (js.Promise[String | Buffer]) = null
  ): PartialResolverOptions = {
    val __obj = js.Dynamic.literal()
    if (canRead != null) __obj.updateDynamic("canRead")(canRead.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2(read))
    __obj.asInstanceOf[PartialResolverOptions]
  }
}

