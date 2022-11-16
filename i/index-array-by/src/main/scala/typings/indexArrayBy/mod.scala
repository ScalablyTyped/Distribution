package typings.indexArrayBy

import org.scalablytyped.runtime.StringDictionary
import typings.indexArrayBy.anon.Keys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("index-array-by", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(list: js.Array[ListItem], keyAccessors: js.Array[KeyAccessor]): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(list: js.Array[ListItem], keyAccessors: js.Array[KeyAccessor], multiItem: Boolean): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(
    list: js.Array[ListItem],
    keyAccessors: js.Array[KeyAccessor],
    multiItem: Boolean,
    flattenKeys: Boolean
  ): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any], flattenKeys.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(
    list: js.Array[ListItem],
    keyAccessors: js.Array[KeyAccessor],
    multiItem: Unit,
    flattenKeys: Boolean
  ): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any], flattenKeys.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(list: js.Array[ListItem], keyAccessors: js.Array[KeyAccessor], multiItem: ReducerFn): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(
    list: js.Array[ListItem],
    keyAccessors: js.Array[KeyAccessor],
    multiItem: ReducerFn,
    flattenKeys: Boolean
  ): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any], flattenKeys.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(list: js.Array[ListItem], keyAccessors: KeyAccessor): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(list: js.Array[ListItem], keyAccessors: KeyAccessor, multiItem: Boolean): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(list: js.Array[ListItem], keyAccessors: KeyAccessor, multiItem: Boolean, flattenKeys: Boolean): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any], flattenKeys.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(list: js.Array[ListItem], keyAccessors: KeyAccessor, multiItem: Unit, flattenKeys: Boolean): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any], flattenKeys.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(list: js.Array[ListItem], keyAccessors: KeyAccessor, multiItem: ReducerFn): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  inline def default(list: js.Array[ListItem], keyAccessors: KeyAccessor, multiItem: ReducerFn, flattenKeys: Boolean): NestedResult | FlatResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], keyAccessors.asInstanceOf[js.Any], multiItem.asInstanceOf[js.Any], flattenKeys.asInstanceOf[js.Any])).asInstanceOf[NestedResult | FlatResult]
  
  type FlatResult = js.Array[Keys]
  
  type KeyAccessor = String | (js.Function1[/* listItem */ ListItem, String])
  
  type ListItem = Any
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NestedResult = {[key: string] : index-array-by.index-array-by.NestedResult | index-array-by.index-array-by.ListItem | std.Array<index-array-by.index-array-by.ListItem>}
  }}}
  to avoid circular code involving: 
  - index-array-by.index-array-by.NestedResult
  */
  trait NestedResult
    extends StObject
       with /* key */ StringDictionary[NestedResult | ListItem | js.Array[ListItem]]
  object NestedResult {
    
    inline def apply(): NestedResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedResult]
    }
  }
  
  type ReducerFn = js.Function1[/* items */ js.Array[ListItem], Any]
}
