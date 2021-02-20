package typings.lcid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get a [standard locale identifier](https://en.wikipedia.org/wiki/Locale_(computer_software)) from a [Windows locale identifier (LCID)](http://en.wikipedia.org/wiki/Locale#Specifics_for_Microsoft_platforms).
  	@example
  	```
  	import lcid = require('lcid');
  	lcid.from(1044);
  	//=> 'nb_NO'
  	```
  	*/
  @JSImport("lcid", "from")
  @js.native
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
  @JSImport("lcid", "to")
  @js.native
  def to(localeId: String): Double = js.native
  
  /**
  	Mapping between [standard locale identifiers](https://en.wikipedia.org/wiki/Locale_(computer_software)) and [Windows locale identifiers (LCID)](http://en.wikipedia.org/wiki/Locale#Specifics_for_Microsoft_platforms).
  	@example
  	```
  	import lcid = require('lcid');
  	lcid.all;
  	//=> {'af_ZA': 1078, …}
  	```
  	*/
  object all
}
