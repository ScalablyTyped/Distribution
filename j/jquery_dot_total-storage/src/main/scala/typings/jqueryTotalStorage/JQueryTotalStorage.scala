package typings.jqueryTotalStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* @desc Set the value of a key to a string
* @example $.totalStorage('the_key', 'the_value');
* @desc Set the value of a key to a number
* @example $.totalStorage('the_key', 800.2);
* @desc Set the value of a key to a complex Array
* @example	var myArray = new Array();
*       myArray.push({name:'Jared', company:'Upstatement', zip:63124});
*       myArray.push({name:'McGruff', company:'Police', zip:60652};
*       $.totalStorage('people', myArray);
*       //to return:
*       $.totalStorage('people');
*
*/
@js.native
trait JQueryTotalStorage extends js.Object {
  /**
    * @desc Set or get a key's value
    * @param key Key to set.
    * @param value Value to set for key. If ommited, current value for key is returned.
  	* @param options Not implemented.
    */
  def apply(key: String): js.Any = js.native
  def apply(key: String, value: js.Any): js.Any = js.native
  def apply(key: String, value: js.Any, options: JQueryTotalStorageOptions): js.Any = js.native
  /**
    * @desc Delete item by key
    * @param key Key of item to delete
    */
  def deleteItem(key: String): Boolean = js.native
  /**
    * @desc Get all set values
    */
  def getAll(): js.Array[_] = js.native
  /**
    * @desc Get a key's value
    * @param key Key to get.
    */
  def getItem(key: String): js.Any = js.native
  /**
    * @desc Set a key's value
    * @param key Key to set.
    * @param value Value to set for key.
    */
  def setItem(key: String, value: js.Any): js.Any = js.native
}

