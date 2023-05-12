package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
import typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`0`
  - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`1`
  - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`2`
  - typings.matrixOrgMatrixSdkCryptoNodejs.matrixOrgMatrixSdkCryptoNodejsInts.`3`
*/
trait HistoryVisibility extends StObject
object HistoryVisibility {
  
  /**
    * Previous events are accessible to newly joined members from
    * the point they were invited onwards.
    *
    * Events stop being accessible when the member's state changes
    * to something other than *invite* or *join*.
    */
  inline def Invited: `0` = 0.asInstanceOf[`0`]
  
  /**
    * Previous events are accessible to newly joined members from
    * the point they joined the room onwards.
    *
    * Events stop being accessible when the member's state changes
    * to something other than *join*.
    */
  inline def Joined: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Previous events are always accessible to newly joined members.
    *
    * All events in the room are accessible, even those sent when
    * the member was not a part of the room.
    */
  inline def Shared: `2` = 2.asInstanceOf[`2`]
  
  /**
    * All events while this is the `HistoryVisibility` value may be
    * shared by any participating homeserver with anyone, regardless
    * of whether they have ever joined the room.
    */
  inline def WorldReadable: `3` = 3.asInstanceOf[`3`]
}
