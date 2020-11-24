package typings.joi.mod

import typings.joi.anon.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceOptions extends HierarchySeparatorOptions {
  
  /**
    * a function with the signature `function(value)` where `value` is the resolved reference value and the return value is the adjusted value to use.
    * Note that the adjust feature will not perform any type validation on the adjusted value and it must match the value expected by the rule it is used in.
    * Cannot be used with `map`.
    *
    * @example `(value) => value + 5`
    */
  var adjust: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  /**
    * If set to a number, sets the reference relative starting point.
    * Cannot be combined with separator prefix characters.
    * Defaults to the reference key prefix (or 1 if none present)
    */
  var ancestor: js.UndefOr[Double] = js.native
  
  /**
    * creates an in-reference.
    */
  var in: js.UndefOr[Boolean] = js.native
  
  /**
    * when true, the reference resolves by reaching into maps and sets.
    */
  var iterables: js.UndefOr[Boolean] = js.native
  
  /**
    * an array of array pairs using the format `[[key, value], [key, value]]` used to maps the resolved reference value to another value.
    * If the resolved value is not in the map, it is returned as-is.
    * Cannot be used with `adjust`.
    */
  var map: js.UndefOr[js.Array[js.Tuple2[_, _]]] = js.native
  
  /**
    * overrides default prefix characters.
    */
  var prefix: js.UndefOr[Global] = js.native
  
  /**
    * when true, the value of the reference is used instead of its name in error messages 
    * and template rendering. Defaults to false.
    */
  var render: js.UndefOr[Boolean] = js.native
}
object ReferenceOptions {
  
  @scala.inline
  def apply(): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceOptions]
  }
  
  @scala.inline
  implicit class ReferenceOptionsOps[Self <: ReferenceOptions] (val x: Self) extends AnyVal {
    
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
    def setAdjust(value: /* value */ js.Any => _): Self = this.set("adjust", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdjust: Self = this.set("adjust", js.undefined)
    
    @scala.inline
    def setAncestor(value: Double): Self = this.set("ancestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAncestor: Self = this.set("ancestor", js.undefined)
    
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setIterables(value: Boolean): Self = this.set("iterables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterables: Self = this.set("iterables", js.undefined)
    
    @scala.inline
    def setMapVarargs(value: (js.Tuple2[js.Any, js.Any])*): Self = this.set("map", js.Array(value :_*))
    
    @scala.inline
    def setMap(value: js.Array[js.Tuple2[_, _]]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setPrefix(value: Global): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRender(value: Boolean): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
