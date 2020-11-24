package typings.jupyterlabObservables.observablemapMod.ObservableMap

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize an observable map.
  */
@js.native
trait IOptions[T] extends js.Object {
  
  /**
    * The item comparison function for change detection on `set`.
    *
    * If not given, strict `===` equality will be used.
    */
  var itemCmp: js.UndefOr[js.Function2[/* first */ T, /* second */ T, Boolean]] = js.native
  
  /**
    * An optional initial set of values.
    */
  var values: js.UndefOr[StringDictionary[T]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T](): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setItemCmp(value: (/* first */ T, /* second */ T) => Boolean): Self = this.set("itemCmp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemCmp: Self = this.set("itemCmp", js.undefined)
    
    @scala.inline
    def setValues(value: StringDictionary[T]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
