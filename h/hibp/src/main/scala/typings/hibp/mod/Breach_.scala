package typings.hibp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breach_ extends js.Object {
  var AddedDate: String = js.native
  var BreachDate: String = js.native
  var DataClasses: js.Array[String] = js.native
  var Description: String = js.native
  var Domain: String = js.native
  var IsFabricated: Boolean = js.native
  var IsRetired: Boolean = js.native
  var IsSensitive: Boolean = js.native
  var IsSpamList: Boolean = js.native
  var IsVerified: Boolean = js.native
  var LogoPath: String = js.native
  var ModifiedDate: String = js.native
  var Name: String = js.native
  var PwnCount: Double = js.native
  var Title: String = js.native
}

object Breach_ {
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
  ): Breach_ = {
    val __obj = js.Dynamic.literal(AddedDate = AddedDate.asInstanceOf[js.Any], BreachDate = BreachDate.asInstanceOf[js.Any], DataClasses = DataClasses.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], IsFabricated = IsFabricated.asInstanceOf[js.Any], IsRetired = IsRetired.asInstanceOf[js.Any], IsSensitive = IsSensitive.asInstanceOf[js.Any], IsSpamList = IsSpamList.asInstanceOf[js.Any], IsVerified = IsVerified.asInstanceOf[js.Any], LogoPath = LogoPath.asInstanceOf[js.Any], ModifiedDate = ModifiedDate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PwnCount = PwnCount.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breach_]
  }
  @scala.inline
  implicit class Breach_Ops[Self <: Breach_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddedDate(value: String): Self = this.set("AddedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreachDate(value: String): Self = this.set("BreachDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataClassesVarargs(value: String*): Self = this.set("DataClasses", js.Array(value :_*))
    @scala.inline
    def setDataClasses(value: js.Array[String]): Self = this.set("DataClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: String): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFabricated(value: Boolean): Self = this.set("IsFabricated", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRetired(value: Boolean): Self = this.set("IsRetired", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSensitive(value: Boolean): Self = this.set("IsSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSpamList(value: Boolean): Self = this.set("IsSpamList", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVerified(value: Boolean): Self = this.set("IsVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogoPath(value: String): Self = this.set("LogoPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("ModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwnCount(value: Double): Self = this.set("PwnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
  }
  
}

