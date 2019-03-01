package typings
package harmonyDashProxyLib.harmonyDashProxyMod.harmonyProxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyHandler[T] extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.undefined
  var construct: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _]
  ] = js.undefined
  var defineProperty: js.UndefOr[
    js.Function3[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* attributes */ stdLib.PropertyDescriptor, 
      scala.Boolean
    ]
  ] = js.undefined
  var deleteProperty: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.undefined
  var enumerate: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.undefined
  var get: js.UndefOr[js.Function3[/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any, _]] = js.undefined
  var getOwnPropertyDescriptor: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, stdLib.PropertyDescriptor]] = js.undefined
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, _]] = js.undefined
  var has: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.undefined
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.undefined
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, js.Array[PropertyKey]]] = js.undefined
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.undefined
  var set: js.UndefOr[
    js.Function4[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* value */ js.Any, 
      /* receiver */ js.Any, 
      scala.Boolean
    ]
  ] = js.undefined
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ js.Any, scala.Boolean]] = js.undefined
}

object ProxyHandler {
  @scala.inline
  def apply[T](
    apply: js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _] = null,
    construct: js.Function3[/* target */ T, /* thisArg */ js.Any, /* argArray */ js.UndefOr[js.Any], _] = null,
    defineProperty: js.Function3[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* attributes */ stdLib.PropertyDescriptor, 
      scala.Boolean
    ] = null,
    deleteProperty: js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean] = null,
    enumerate: js.Function1[/* target */ T, js.Array[PropertyKey]] = null,
    get: js.Function3[/* target */ T, /* p */ PropertyKey, /* receiver */ js.Any, _] = null,
    getOwnPropertyDescriptor: js.Function2[/* target */ T, /* p */ PropertyKey, stdLib.PropertyDescriptor] = null,
    getPrototypeOf: js.Function1[/* target */ T, _] = null,
    has: js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean] = null,
    isExtensible: js.Function1[/* target */ T, scala.Boolean] = null,
    ownKeys: js.Function1[/* target */ T, js.Array[PropertyKey]] = null,
    preventExtensions: js.Function1[/* target */ T, scala.Boolean] = null,
    set: js.Function4[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* value */ js.Any, 
      /* receiver */ js.Any, 
      scala.Boolean
    ] = null,
    setPrototypeOf: js.Function2[/* target */ T, /* v */ js.Any, scala.Boolean] = null
  ): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(apply)
    if (construct != null) __obj.updateDynamic("construct")(construct)
    if (defineProperty != null) __obj.updateDynamic("defineProperty")(defineProperty)
    if (deleteProperty != null) __obj.updateDynamic("deleteProperty")(deleteProperty)
    if (enumerate != null) __obj.updateDynamic("enumerate")(enumerate)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getOwnPropertyDescriptor != null) __obj.updateDynamic("getOwnPropertyDescriptor")(getOwnPropertyDescriptor)
    if (getPrototypeOf != null) __obj.updateDynamic("getPrototypeOf")(getPrototypeOf)
    if (has != null) __obj.updateDynamic("has")(has)
    if (isExtensible != null) __obj.updateDynamic("isExtensible")(isExtensible)
    if (ownKeys != null) __obj.updateDynamic("ownKeys")(ownKeys)
    if (preventExtensions != null) __obj.updateDynamic("preventExtensions")(preventExtensions)
    if (set != null) __obj.updateDynamic("set")(set)
    if (setPrototypeOf != null) __obj.updateDynamic("setPrototypeOf")(setPrototypeOf)
    __obj.asInstanceOf[ProxyHandler[T]]
  }
}

