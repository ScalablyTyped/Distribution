package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPageLabels extends js.Object {
  
  var lblAdd: js.UndefOr[String] = js.native
  
  var lblEditHead: js.UndefOr[String] = js.native
  
  var lblEditKeyField: js.UndefOr[String] = js.native
  
  var lblEditValueField: js.UndefOr[String] = js.native
  
  var lblEditedExpressionsHead: js.UndefOr[String] = js.native
  
  var lblFind: js.UndefOr[String] = js.native
  
  var lblFindHead: js.UndefOr[String] = js.native
  
  var lblFindedExpressionsHead: js.UndefOr[String] = js.native
  
  var lblModify: js.UndefOr[String] = js.native
  
  var lblOrderedTest: js.UndefOr[String] = js.native
  
  var lblOrderedTestHlp: js.UndefOr[String] = js.native
  
  var lblPageHeader: js.UndefOr[String] = js.native
  
  var lblRandomlyTest: js.UndefOr[String] = js.native
  
  var lblRandomlyTestHlp: js.UndefOr[String] = js.native
  
  var lblRemove: js.UndefOr[String] = js.native
  
  var lblSearchField: js.UndefOr[String] = js.native
  
  var lblSearchInExpressions: js.UndefOr[String] = js.native
  
  var lblSearchInExpressionsHlp: js.UndefOr[String] = js.native
  
  var lblSearchInMeanings: js.UndefOr[String] = js.native
  
  var lblSearchInMeaningsHlp: js.UndefOr[String] = js.native
  
  var lblSelectedTest: js.UndefOr[String] = js.native
  
  var lblSelectedTestHlp: js.UndefOr[String] = js.native
  
  var lblStartTest: js.UndefOr[String] = js.native
  
  var lblStopTest: js.UndefOr[String] = js.native
  
  var lblTestHead: js.UndefOr[String] = js.native
  
  var lblTitle: js.UndefOr[String] = js.native
  
  var lblTypedTest: js.UndefOr[String] = js.native
  
  var lblTypedTestHlp: js.UndefOr[String] = js.native
  
  var lblVoicedTest: js.UndefOr[String] = js.native
  
  var lblVoicedTestHlp: js.UndefOr[String] = js.native
  
  var lblWrittedTest: js.UndefOr[String] = js.native
  
  var lblWrittedTestHlp: js.UndefOr[String] = js.native
}
object IPageLabels {
  
  @scala.inline
  def apply(): IPageLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageLabels]
  }
  
  @scala.inline
  implicit class IPageLabelsOps[Self <: IPageLabels] (val x: Self) extends AnyVal {
    
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
    def setLblAdd(value: String): Self = this.set("lblAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblAdd: Self = this.set("lblAdd", js.undefined)
    
    @scala.inline
    def setLblEditHead(value: String): Self = this.set("lblEditHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblEditHead: Self = this.set("lblEditHead", js.undefined)
    
    @scala.inline
    def setLblEditKeyField(value: String): Self = this.set("lblEditKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblEditKeyField: Self = this.set("lblEditKeyField", js.undefined)
    
    @scala.inline
    def setLblEditValueField(value: String): Self = this.set("lblEditValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblEditValueField: Self = this.set("lblEditValueField", js.undefined)
    
    @scala.inline
    def setLblEditedExpressionsHead(value: String): Self = this.set("lblEditedExpressionsHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblEditedExpressionsHead: Self = this.set("lblEditedExpressionsHead", js.undefined)
    
    @scala.inline
    def setLblFind(value: String): Self = this.set("lblFind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblFind: Self = this.set("lblFind", js.undefined)
    
    @scala.inline
    def setLblFindHead(value: String): Self = this.set("lblFindHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblFindHead: Self = this.set("lblFindHead", js.undefined)
    
    @scala.inline
    def setLblFindedExpressionsHead(value: String): Self = this.set("lblFindedExpressionsHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblFindedExpressionsHead: Self = this.set("lblFindedExpressionsHead", js.undefined)
    
    @scala.inline
    def setLblModify(value: String): Self = this.set("lblModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblModify: Self = this.set("lblModify", js.undefined)
    
    @scala.inline
    def setLblOrderedTest(value: String): Self = this.set("lblOrderedTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblOrderedTest: Self = this.set("lblOrderedTest", js.undefined)
    
    @scala.inline
    def setLblOrderedTestHlp(value: String): Self = this.set("lblOrderedTestHlp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblOrderedTestHlp: Self = this.set("lblOrderedTestHlp", js.undefined)
    
    @scala.inline
    def setLblPageHeader(value: String): Self = this.set("lblPageHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblPageHeader: Self = this.set("lblPageHeader", js.undefined)
    
    @scala.inline
    def setLblRandomlyTest(value: String): Self = this.set("lblRandomlyTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblRandomlyTest: Self = this.set("lblRandomlyTest", js.undefined)
    
    @scala.inline
    def setLblRandomlyTestHlp(value: String): Self = this.set("lblRandomlyTestHlp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblRandomlyTestHlp: Self = this.set("lblRandomlyTestHlp", js.undefined)
    
    @scala.inline
    def setLblRemove(value: String): Self = this.set("lblRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblRemove: Self = this.set("lblRemove", js.undefined)
    
    @scala.inline
    def setLblSearchField(value: String): Self = this.set("lblSearchField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblSearchField: Self = this.set("lblSearchField", js.undefined)
    
    @scala.inline
    def setLblSearchInExpressions(value: String): Self = this.set("lblSearchInExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblSearchInExpressions: Self = this.set("lblSearchInExpressions", js.undefined)
    
    @scala.inline
    def setLblSearchInExpressionsHlp(value: String): Self = this.set("lblSearchInExpressionsHlp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblSearchInExpressionsHlp: Self = this.set("lblSearchInExpressionsHlp", js.undefined)
    
    @scala.inline
    def setLblSearchInMeanings(value: String): Self = this.set("lblSearchInMeanings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblSearchInMeanings: Self = this.set("lblSearchInMeanings", js.undefined)
    
    @scala.inline
    def setLblSearchInMeaningsHlp(value: String): Self = this.set("lblSearchInMeaningsHlp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblSearchInMeaningsHlp: Self = this.set("lblSearchInMeaningsHlp", js.undefined)
    
    @scala.inline
    def setLblSelectedTest(value: String): Self = this.set("lblSelectedTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblSelectedTest: Self = this.set("lblSelectedTest", js.undefined)
    
    @scala.inline
    def setLblSelectedTestHlp(value: String): Self = this.set("lblSelectedTestHlp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblSelectedTestHlp: Self = this.set("lblSelectedTestHlp", js.undefined)
    
    @scala.inline
    def setLblStartTest(value: String): Self = this.set("lblStartTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblStartTest: Self = this.set("lblStartTest", js.undefined)
    
    @scala.inline
    def setLblStopTest(value: String): Self = this.set("lblStopTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblStopTest: Self = this.set("lblStopTest", js.undefined)
    
    @scala.inline
    def setLblTestHead(value: String): Self = this.set("lblTestHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblTestHead: Self = this.set("lblTestHead", js.undefined)
    
    @scala.inline
    def setLblTitle(value: String): Self = this.set("lblTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblTitle: Self = this.set("lblTitle", js.undefined)
    
    @scala.inline
    def setLblTypedTest(value: String): Self = this.set("lblTypedTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblTypedTest: Self = this.set("lblTypedTest", js.undefined)
    
    @scala.inline
    def setLblTypedTestHlp(value: String): Self = this.set("lblTypedTestHlp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblTypedTestHlp: Self = this.set("lblTypedTestHlp", js.undefined)
    
    @scala.inline
    def setLblVoicedTest(value: String): Self = this.set("lblVoicedTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblVoicedTest: Self = this.set("lblVoicedTest", js.undefined)
    
    @scala.inline
    def setLblVoicedTestHlp(value: String): Self = this.set("lblVoicedTestHlp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblVoicedTestHlp: Self = this.set("lblVoicedTestHlp", js.undefined)
    
    @scala.inline
    def setLblWrittedTest(value: String): Self = this.set("lblWrittedTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblWrittedTest: Self = this.set("lblWrittedTest", js.undefined)
    
    @scala.inline
    def setLblWrittedTestHlp(value: String): Self = this.set("lblWrittedTestHlp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLblWrittedTestHlp: Self = this.set("lblWrittedTestHlp", js.undefined)
  }
}
