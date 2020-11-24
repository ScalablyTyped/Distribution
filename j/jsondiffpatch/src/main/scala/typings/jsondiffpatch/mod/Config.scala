package typings.jsondiffpatch.mod

import typings.jsondiffpatch.anon.DetectMove
import typings.jsondiffpatch.anon.MinLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var arrays: js.UndefOr[DetectMove] = js.native
  
  /**
    *  default false. if true, values in the obtained delta will be cloned (using jsondiffpatch.clone by default),
    *  to ensure delta keeps no references to left or right objects. this becomes useful if you're diffing and patching
    *  the same objects multiple times without serializing deltas.
    *
    *  instead of true, a function can be specified here to provide a custom clone(value)
    */
  var cloneDiffValues: js.UndefOr[Boolean | (js.Function1[/* value */ js.Any, _])] = js.native
  
  // used to match objects when diffing arrays, by default only === operator is used
  var objectHash: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, String]] = js.native
  
  /**
    * this optional function can be specified to ignore object properties (eg. volatile data)
    * @param name property name, present in either context.left or context.right objects
    * @param context the diff context (has context.left and context.right objects)
    */
  /**
    *
    */
  var propertyFilter: js.UndefOr[js.Function2[/* name */ String, /* context */ DiffContext, Boolean]] = js.native
  
  var textDiff: js.UndefOr[MinLength] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setArrays(value: DetectMove): Self = this.set("arrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrays: Self = this.set("arrays", js.undefined)
    
    @scala.inline
    def setCloneDiffValuesFunction1(value: /* value */ js.Any => _): Self = this.set("cloneDiffValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloneDiffValues(value: Boolean | (js.Function1[/* value */ js.Any, _])): Self = this.set("cloneDiffValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneDiffValues: Self = this.set("cloneDiffValues", js.undefined)
    
    @scala.inline
    def setObjectHash(value: (/* item */ js.Any, /* index */ Double) => String): Self = this.set("objectHash", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteObjectHash: Self = this.set("objectHash", js.undefined)
    
    @scala.inline
    def setPropertyFilter(value: (/* name */ String, /* context */ DiffContext) => Boolean): Self = this.set("propertyFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePropertyFilter: Self = this.set("propertyFilter", js.undefined)
    
    @scala.inline
    def setTextDiff(value: MinLength): Self = this.set("textDiff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDiff: Self = this.set("textDiff", js.undefined)
  }
}
