package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules[P /* <: js.Object */] extends js.Object {
  var description: js.UndefOr[java.lang.String | (js.Function1[/* params */ P, java.lang.String])] = js.undefined
  var name: java.lang.String
  var params: js.UndefOr[
    ObjectSchema | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof P ]: joi.joi.SchemaLike}
    */ joiLib.joiLibStrings.Rules with js.Any)
  ] = js.undefined
  var setup: js.UndefOr[
    js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | scala.Unit]
  ] = js.undefined
  var validate: js.UndefOr[
    js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.undefined
}

object Rules {
  @scala.inline
  def apply[P /* <: js.Object */](
    name: java.lang.String,
    description: java.lang.String | (js.Function1[/* params */ P, java.lang.String]) = null,
    params: ObjectSchema | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof P ]: joi.joi.SchemaLike}
    */ joiLib.joiLibStrings.Rules with js.Any) = null,
    setup: js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | scala.Unit] = null,
    validate: js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ] = null
  ): Rules[P] = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Rules[P]]
  }
}

