package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LookupLookupowner extends js.Object {
  def lookup(stable: java.lang.String): scala.Double
  def lookup_owner(stable: java.lang.String, sowner: java.lang.String): scala.Double
}

object Anon_LookupLookupowner {
  @scala.inline
  def apply(
    lookup: java.lang.String => scala.Double,
    lookup_owner: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_LookupLookupowner = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), lookup_owner = js.Any.fromFunction2(lookup_owner))
  
    __obj.asInstanceOf[Anon_LookupLookupowner]
  }
}

