package typings.magnetUri.mod

import typings.node.Buffer
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends Object {
  var announce: js.UndefOr[js.Array[String]] = js.native
  var as: js.UndefOr[String | js.Array[String]] = js.native
  var dn: js.UndefOr[String | js.Array[String]] = js.native
  var infoHash: js.UndefOr[String] = js.native
  var infoHashBuffer: js.UndefOr[Buffer] = js.native
  var ix: js.UndefOr[Double | js.Array[Double]] = js.native
  var keywords: js.UndefOr[String | js.Array[String]] = js.native
  var kt: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String | js.Array[String]] = js.native
  var tr: js.UndefOr[String | js.Array[String]] = js.native
  var urlList: js.UndefOr[js.Array[String]] = js.native
  var ws: js.UndefOr[String | js.Array[String]] = js.native
  var xs: js.UndefOr[String | js.Array[String]] = js.native
  var xt: js.UndefOr[String | js.Array[String]] = js.native
}

object Instance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setAnnounceVarargs(value: String*): Self = this.set("announce", js.Array(value :_*))
    @scala.inline
    def setAnnounce(value: js.Array[String]): Self = this.set("announce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnounce: Self = this.set("announce", js.undefined)
    @scala.inline
    def setAsVarargs(value: String*): Self = this.set("as", js.Array(value :_*))
    @scala.inline
    def setAs(value: String | js.Array[String]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setDnVarargs(value: String*): Self = this.set("dn", js.Array(value :_*))
    @scala.inline
    def setDn(value: String | js.Array[String]): Self = this.set("dn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDn: Self = this.set("dn", js.undefined)
    @scala.inline
    def setInfoHash(value: String): Self = this.set("infoHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoHash: Self = this.set("infoHash", js.undefined)
    @scala.inline
    def setInfoHashBuffer(value: Buffer): Self = this.set("infoHashBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoHashBuffer: Self = this.set("infoHashBuffer", js.undefined)
    @scala.inline
    def setIxVarargs(value: Double*): Self = this.set("ix", js.Array(value :_*))
    @scala.inline
    def setIx(value: Double | js.Array[Double]): Self = this.set("ix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIx: Self = this.set("ix", js.undefined)
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    @scala.inline
    def setKeywords(value: String | js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setKtVarargs(value: String*): Self = this.set("kt", js.Array(value :_*))
    @scala.inline
    def setKt(value: js.Array[String]): Self = this.set("kt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKt: Self = this.set("kt", js.undefined)
    @scala.inline
    def setNameVarargs(value: String*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: String | js.Array[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTrVarargs(value: String*): Self = this.set("tr", js.Array(value :_*))
    @scala.inline
    def setTr(value: String | js.Array[String]): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
    @scala.inline
    def setUrlListVarargs(value: String*): Self = this.set("urlList", js.Array(value :_*))
    @scala.inline
    def setUrlList(value: js.Array[String]): Self = this.set("urlList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlList: Self = this.set("urlList", js.undefined)
    @scala.inline
    def setWsVarargs(value: String*): Self = this.set("ws", js.Array(value :_*))
    @scala.inline
    def setWs(value: String | js.Array[String]): Self = this.set("ws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWs: Self = this.set("ws", js.undefined)
    @scala.inline
    def setXsVarargs(value: String*): Self = this.set("xs", js.Array(value :_*))
    @scala.inline
    def setXs(value: String | js.Array[String]): Self = this.set("xs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
    @scala.inline
    def setXtVarargs(value: String*): Self = this.set("xt", js.Array(value :_*))
    @scala.inline
    def setXt(value: String | js.Array[String]): Self = this.set("xt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXt: Self = this.set("xt", js.undefined)
  }
  
}

