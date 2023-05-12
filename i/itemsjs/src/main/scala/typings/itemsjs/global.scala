package typings.itemsjs

import typings.itemsjs.mod.Configuration
import typings.itemsjs.mod.ItemsJs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Main itemsjs function
    * @param items The items to index
    * @param configuration itemsjs
    * @template I The type of items being indexed
    */
  inline def itemsjs[I /* <: js.Object */, S /* <: String */, A /* <: /* keyof I */ String */](items: js.Array[I]): ItemsJs[I, S, A] = js.Dynamic.global.applyDynamic("itemsjs")(items.asInstanceOf[js.Any]).asInstanceOf[ItemsJs[I, S, A]]
  inline def itemsjs[I /* <: js.Object */, S /* <: String */, A /* <: /* keyof I */ String */](items: js.Array[I], configuration: Configuration[I, S, A]): ItemsJs[I, S, A] = (js.Dynamic.global.applyDynamic("itemsjs")(items.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[ItemsJs[I, S, A]]
}
