package typings.hibp.hibpMod

import typings.hibp.Anon_BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breach extends js.Object {
  var AddedDate: String
  var BreachDate: String
  var DataClasses: js.Array[String]
  var Description: String
  var Domain: String
  var IsFabricated: Boolean
  var IsRetired: Boolean
  var IsSensitive: Boolean
  var IsSpamList: Boolean
  var IsVerified: Boolean
  var LogoPath: String
  var ModifiedDate: String
  var Name: String
  var PwnCount: Double
  var Title: String
}

object Breach {
  @scala.inline
  def apply(
    AddedDate: String,
    BreachDate: String,
    DataClasses: js.Array[String],
    Description: String,
    Domain: String,
    IsFabricated: Boolean,
    IsRetired: Boolean,
    IsSensitive: Boolean,
    IsSpamList: Boolean,
    IsVerified: Boolean,
    LogoPath: String,
    ModifiedDate: String,
    Name: String,
    PwnCount: Double,
    Title: String
  ): Breach = {
    val __obj = js.Dynamic.literal(AddedDate = AddedDate.asInstanceOf[js.Any], BreachDate = BreachDate.asInstanceOf[js.Any], DataClasses = DataClasses.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], IsFabricated = IsFabricated.asInstanceOf[js.Any], IsRetired = IsRetired.asInstanceOf[js.Any], IsSensitive = IsSensitive.asInstanceOf[js.Any], IsSpamList = IsSpamList.asInstanceOf[js.Any], IsVerified = IsVerified.asInstanceOf[js.Any], LogoPath = LogoPath.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PwnCount = PwnCount.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Breach]
  }
}

@JSImport("hibp", "breach")
@js.native
object breach extends js.Object {
  def apply(breachName: String): js.Promise[Breach | Null] = js.native
  def apply(breachName: String, options: Anon_BaseUrl): js.Promise[Breach | Null] = js.native
}

