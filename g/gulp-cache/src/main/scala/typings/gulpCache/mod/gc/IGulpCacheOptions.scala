package typings.gulpCache.mod.gc

import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpCacheOptions extends js.Object {
  /**
    * The cache instance to use for caching.
    */
  var fileCache: js.UndefOr[IGulpCache] = js.native
  /**
    * The hash generator to use.
    */
  var key: js.UndefOr[
    js.Function2[
      /* file */ File, 
      /* callback */ js.UndefOr[js.Function2[/* err */ js.Any, /* result */ String, Unit]], 
      String | js.Promise[String]
    ]
  ] = js.native
  /**
    * The name of the bucket which stores the cached objects.
    * Default value = 'default'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Value representing the success of a task.
    */
  var success: js.UndefOr[Boolean | Predicate[_]] = js.native
  /**
    * Content that is to be cached.
    */
  var value: js.UndefOr[js.Function1[/* result */ js.Any, js.Object | js.Promise[js.Object] | String]] = js.native
}

object IGulpCacheOptions {
  @scala.inline
  def apply(): IGulpCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGulpCacheOptions]
  }
  @scala.inline
  implicit class IGulpCacheOptionsOps[Self <: IGulpCacheOptions] (val x: Self) extends AnyVal {
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
    def setFileCache(value: IGulpCache): Self = this.set("fileCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileCache: Self = this.set("fileCache", js.undefined)
    @scala.inline
    def setKey(
      value: (/* file */ File, /* callback */ js.UndefOr[js.Function2[/* err */ js.Any, /* result */ String, Unit]]) => String | js.Promise[String]
    ): Self = this.set("key", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSuccessFunction1(value: _ => Boolean): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: Boolean | Predicate[_]): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setValue(value: /* result */ js.Any => js.Object | js.Promise[js.Object] | String): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

