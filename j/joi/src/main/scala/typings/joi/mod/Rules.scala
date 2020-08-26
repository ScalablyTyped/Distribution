package typings.joi.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules[P /* <: js.Object */] extends js.Object {
  var description: js.UndefOr[String | (js.Function1[/* params */ P, String])] = js.native
  var name: String = js.native
  var params: js.UndefOr[
    ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof P ]: joi.joi.SchemaLike}
    */ typings.joi.joiStrings.Rules with TopLevel[js.Any])
  ] = js.native
  var setup: js.UndefOr[js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]] = js.native
  var validate: js.UndefOr[
    js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
}

object Rules {
  @scala.inline
  def apply[/* <: js.Object */ P](name: String): Rules[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[P]]
  }
  @scala.inline
  implicit class RulesOps[Self <: Rules[_], /* <: js.Object */ P] (val x: Self with Rules[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptionFunction1(value: /* params */ P => String): Self = this.set("description", js.Any.fromFunction1(value))
    @scala.inline
    def setDescription(value: String | (js.Function1[/* params */ P, String])): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setParams(
      value: ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in keyof P ]: joi.joi.SchemaLike}
      */ typings.joi.joiStrings.Rules with TopLevel[js.Any])
    ): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setSetup(value: js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]): Self = this.set("setup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    @scala.inline
    def setValidate(
      value: js.ThisFunction4[
          /* this */ ExtensionBoundSchema, 
          /* params */ P, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

