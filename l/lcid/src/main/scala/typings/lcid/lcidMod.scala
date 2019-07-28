package typings.lcid

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lcid", JSImport.Namespace)
@js.native
object lcidMod extends js.Object {
  /**
  	Mapping between [standard locale identifiers](https://en.wikipedia.org/wiki/Locale_(computer_software)) and [Windows locale identifiers (LCID)](http://en.wikipedia.org/wiki/Locale#Specifics_for_Microsoft_platforms).
  	@example
  	```
  	import lcid = require('lcid');
  	lcid.all;
  	//=> {'af_ZA': 1078, …}
  	```
  	*/
  val all: StringDictionary[Double] = js.native
  /**
  	Get a [standard locale identifier](https://en.wikipedia.org/wiki/Locale_(computer_software)) from a [Windows locale identifier (LCID)](http://en.wikipedia.org/wiki/Locale#Specifics_for_Microsoft_platforms).
  	@example
  	```
  	import lcid = require('lcid');
  	lcid.from(1044);
  	//=> 'nb_NO'
  	```
  	*/
  def from(lcidCode: Double): String = js.native
  /**
  	Get a [Windows locale identifier (LCID)](https://en.wikipedia.org/wiki/Locale#Specifics_for_Microsoft_platforms) from a [standard locale identifier](https://en.wikipedia.org/wiki/Locale_(computer_software)).
  	@example
  	```
  	import lcid = require('lcid');
  	lcid.to('nb_NO');
  	//=> 1044
  	```
  	*/
  def to(localeId: String): Double = js.native
}

