package typings.lcid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lcid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Get a [standard locale identifier](https://en.wikipedia.org/wiki/Locale_(computer_software)) from a [Windows locale identifier (LCID)](https://en.wikipedia.org/wiki/Locale#Specifics_for_Microsoft_platforms).
  	@example
  	```
  	import lcid from 'lcid';
  	lcid.from(1044);
  	//=> 'nb_NO'
  	```
  	*/
  inline def from(lcidCode: Double): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(lcidCode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
  	Get a [Windows locale identifier (LCID)](https://en.wikipedia.org/wiki/Locale#Specifics_for_Microsoft_platforms) from a [standard locale identifier](https://en.wikipedia.org/wiki/Locale_(computer_software)).
  	@example
  	```
  	import lcid from 'lcid';
  	lcid.to('nb_NO');
  	//=> 1044
  	```
  	*/
  inline def to(localeId: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("to")(localeId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
}
