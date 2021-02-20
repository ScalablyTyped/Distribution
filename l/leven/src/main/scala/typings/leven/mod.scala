package typings.leven

import typings.leven.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Measure the difference between two strings.
  	@example
  	```
  	import leven = require('leven');
  	leven('cat', 'cow');
  	//=> 2
  	```
  	*/
  @JSImport("leven", JSImport.Namespace)
  @js.native
  def apply(left: String, right: String): Double = js.native
  
  @JSImport("leven", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function leven(left: string, right: string): number;
  // export = leven;
  @JSImport("leven", "default")
  @js.native
  def default: Call = js.native
  /**
  	Measure the difference between two strings.
  	@example
  	```
  	import leven = require('leven');
  	leven('cat', 'cow');
  	//=> 2
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function leven(left: string, right: string): number;
  // export = leven;
  @JSImport("leven", "default")
  @js.native
  def default(left: String, right: String): Double = js.native
  @scala.inline
  def default_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
