package typings.levenary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("levenary", JSImport.Namespace)
@js.native
object levenaryMod extends js.Object {
  /**
    Return the string within `array`, whose Levenshtein distance from `str` is minimal.
  	@example
  	```
  	import levenary from 'levenary';
  	levenary('cat', ['cow', 'dog', 'pig']);
  	//=> 'cow'
  	```
  	*/
  def default(str: String, array: js.Array[String]): String = js.native
}

