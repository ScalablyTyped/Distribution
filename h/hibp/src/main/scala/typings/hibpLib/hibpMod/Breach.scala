package typings
package hibpLib.hibpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breach extends js.Object {
  var AddedDate: java.lang.String
  var BreachDate: java.lang.String
  var DataClasses: js.Array[java.lang.String]
  var Description: java.lang.String
  var Domain: java.lang.String
  var IsFabricated: scala.Boolean
  var IsRetired: scala.Boolean
  var IsSensitive: scala.Boolean
  var IsSpamList: scala.Boolean
  var IsVerified: scala.Boolean
  var LogoPath: java.lang.String
  var ModifiedDate: java.lang.String
  var Name: java.lang.String
  var PwnCount: scala.Double
  var Title: java.lang.String
}

object Breach {
  @scala.inline
  def apply(
    AddedDate: java.lang.String,
    BreachDate: java.lang.String,
    DataClasses: js.Array[java.lang.String],
    Description: java.lang.String,
    Domain: java.lang.String,
    IsFabricated: scala.Boolean,
    IsRetired: scala.Boolean,
    IsSensitive: scala.Boolean,
    IsSpamList: scala.Boolean,
    IsVerified: scala.Boolean,
    LogoPath: java.lang.String,
    ModifiedDate: java.lang.String,
    Name: java.lang.String,
    PwnCount: scala.Double,
    Title: java.lang.String
  ): Breach = {
    val __obj = js.Dynamic.literal(AddedDate = AddedDate, BreachDate = BreachDate, DataClasses = DataClasses, Description = Description, Domain = Domain, IsFabricated = IsFabricated, IsRetired = IsRetired, IsSensitive = IsSensitive, IsSpamList = IsSpamList, IsVerified = IsVerified, LogoPath = LogoPath, ModifiedDate = ModifiedDate, Name = Name, PwnCount = PwnCount, Title = Title)
  
    __obj.asInstanceOf[Breach]
  }
}

