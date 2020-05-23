package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 跨域网络请求对象
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
  */
@js.native
trait PlusNetXMLHttpRequest extends js.Object {
  /**
    * 网络请求取消事件
    * 通常在调用abort方法取消HTTP请求时触发。
    *     此事件在onreadystatechange事件触发状态4事件之后。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var onabort: js.UndefOr[js.Function1[/* result */ PlusNetProgressEvent, Unit]] = js.native
  /**
    * 网络请求错误事件
    * 通常在HTTP请求发生错误时触发，如无法连接到服务器等各种错误都触发此事件。
    *     此事件在onreadystatechange事件触发状态4事件之后。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var onerror: js.UndefOr[js.Function1[/* result */ PlusNetProgressEvent, Unit]] = js.native
  /**
    * 网络请求成功事件
    * 通常在HTTP请求成功完成时触发，如果HTTP请求发生错误则不触发此事件。
    *     此事件在onreadystatechange事件触发状态4事件之后。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var onload: js.UndefOr[js.Function1[/* result */ PlusNetProgressEvent, Unit]] = js.native
  /**
    * 网络请求结束事件
    * 通常在HTTP请求结束时触发，不管是HTTP请求失败、成功、或超时之后都会触发此事件。
    *     此事件在onreadystatechange事件触发状态4事件之后。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var onloadend: js.UndefOr[js.Function1[/* result */ PlusNetProgressEvent, Unit]] = js.native
  /**
    * 网络请求开始事件
    * 通常在调用send方法开始发起HTTP请求时触发。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var onloadstart: js.UndefOr[js.Function1[/* result */ PlusNetProgressEvent, Unit]] = js.native
  /**
    * 网络请求传输数据事件
    * 通常在HTTP请求链接已经建立，开始传输数据时触发，在数据传输的过程中可能多次触发，此事件与onreadystatechange事件触发状态3类似。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var onprogress: js.UndefOr[js.Function1[/* result */ PlusNetProgressEvent, Unit]] = js.native
  /**
    * 网络请求状态发生变化事件
    * 网络请求状态发生变化时触发，通常在函数中判断对象的state属性值来获取当前请求的状态。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var onreadystatechange: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 网络请求超时事件
    * 通常在HTTP请求超时时触发，此时不会触发onerror事件。
    *     此事件在onreadystatechange事件触发状态4事件之后。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var ontimeout: js.UndefOr[js.Function1[/* result */ PlusNetProgressEvent, Unit]] = js.native
  /**
    * HTTP 请求的状态
    * 当一个 XMLHttpRequest 初次创建时，这个属性的值从 0 开始，直到接收到完整的 HTTP 响应，这个值增加到 4。
    *     5 个状态中每一个都有一个相关联的非正式的名称，下表列出了状态、名称和含义：
    *         0 Uninitialized，未初始化状态。XMLHttpRequest对象已创建或已被abort()方法重置。
    *         1 Open，open()方法已调用，但是send()方法未调用。请求还没有被发送。
    *         2 Sent，send()方法已调用，HTTP 请求已发送到Web服务器。未接收到响应。
    *         3 Receiving，所有响应头部都已经接收到。响应体开始接收但未完成。
    *         4 Loaded，HTTP响应已经完全接收。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var readyState: js.UndefOr[Double] = js.native
  /**
    * 请求从服务器接收到的响应数据
    * 如果没有从服务器接收到数据，则为null；
    *     否则根据responseType类型决定：
    *         如果responseType设置为空字符串或"text"，则返回空字符串；
    *         如果responseType设置为"document"，则返回Document对象；
    *         如果responseType设置为"json"，则返回JSON对象；
    *     若服务器返回的数据与设置的responseType类型不区配，则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var response: js.UndefOr[String] = js.native
  /**
    * 请求从服务器接收到的响应数据（字符串数据）
    * 如果还没有接收到数据的话，此属性值为空字符串；
    *     如果readyState小于3，此属性值为空字符串；
    *     如果readyState为3，此属性值返回目前已经接收的HTTP响应部分数据值；
    *     如果readyState为4，此属性值保存了完整的HTTP响应数据体。
    *     如果HTTP请求返回的数据头中包含了Content-Type值中指定字符编码，就使用该编码，否则，使用UTF-8字符集。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var responseText: js.UndefOr[String] = js.native
  /**
    * 请求响应数据response的类型
    * 默认值为空字符串，即reponse为String，类型可设置："document"表示Document对象，"json"表示JSON对象，"text"表示字符串。
    *     此值必须在调用send方法之前设置，否则设置的值不生效，仍使用之前设置的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var responseType: js.UndefOr[String] = js.native
  /**
    * 请求响应的Document对象
    * 对请求的响应，解析为 XML 并作为 Document 对象返回。
    *     如果请求未成功，或响应的数据无法被解析为XML，则返回null。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var responseXML: js.UndefOr[String] = js.native
  /**
    * 服务器返回的HTTP状态代码
    * 服务器返回的HTTP状态代码，如200表示成功，而404表示"Not Found"错误；
    *     当readyState小于3的时候此属性值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var status: js.UndefOr[Double] = js.native
  /**
    * 服务器返回的HTTP状态描述
    * 此属性值用名称而不是数字指定了请求的HTTP的状态代码。
    *     也就是说，当状态为200的时候它是"OK"；当状态为404的时候它是"Not Found"。
    *     和status属性类似，当readyState小于3的时候读取这一属性会返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var statusText: js.UndefOr[String] = js.native
  /**
    * 请求服务器的超时时间，单位为毫秒（ms）
    * 数值类型，单位为ms，其默认值为120秒。
    *     超时时间为服务器响应请求的时间（不是Http请求完成的总时间），如果设置为0则表示永远不超时。
    *     必须在请求发起前设置，否则当前请求将不生效，在当前请求完成后重新发起新请求时生效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * 是否支持跨域请求
    * 此对象创建的HTTP请求都支持跨域，所以永远返回true。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
  /**
    * 取消当前响应，关闭连接并且结束任何未决的网络活动
    * 此方法把XMLHttpRequest对象重置为readyState为0的状态，并且取消所有未决的网络活动。
    *     调用此方法后将停止触发XMLHttpRequest对象的所有事件。
    *     例如，如果请求用了太长时间，而且响应不再必要的时候，可以调用这个方法。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  def abort(): Unit = js.native
  /**
    * 获取HTTP响应头部信息
    * 把HTTP响应头部作为未解析的字符串返回。 如果readyState小于3，这个方法返回null。
    *     否则，它返回服务器发送的所有 HTTP 响应的头部。头部作为单个的字符串返回，一行一个头部。每行用换行符"\r\n"隔开。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  def getAllResponseHeaders(): String = js.native
  /**
    * 获取指定的HTTP响应头部的值
    * 其参数是要返回的 HTTP 响应头部的名称。可以使用任何大小写来制定这个头部名字，和响应头部的比较是不区分大小写的。
    *     该方法的返回值是指定的 HTTP 响应头部的值，如果没有接收到这个头部或者readyState小于3则为空字符串。
    *     如果接收到多个有指定名称的头部，这个头部的值被连接起来并返回，使用逗号和空格分隔开各个头部的值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  def getResponseHeader(): String = js.native
  def getResponseHeader(headerName: String): String = js.native
  /**
    * 初始化HTTP请求参数，例如URL和HTTP方法，但是并不发送请求
    * 这个方法初始化请求参数以供 send() 方法稍后使用。它把readyState设置为1，删除之前指定的所有请求头部，以及之前接收的所有响应头部，并且把responseText、responseXML、status 以及 statusText 参数设置为它们的默认值。
    *     当readyState为0的时候（当XMLHttpRequest对象刚创建或者abort()方法调用后）以及当readyState为4时（已经接收响应时），调用这个方法是安全的。
    *     当针对任何其他状态调用的时候，open()方法的行为是为指定的。
    *     除了保存供send()方法使用的请求参数，以及重置 XMLHttpRequest 对象以便复用，open()方法没有其他的行为。
    *     要特别注意，当这个方法调用的时候，实现通常不会打开一个到Web服务器的网络连接。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  def open(): Unit = js.native
  def open(method: String): Unit = js.native
  def open(method: String, url: String): Unit = js.native
  def open(method: String, url: String, username: String): Unit = js.native
  def open(method: String, url: String, username: String, password: String): Unit = js.native
  /**
    * 重写服务器返回的MIME类型
    * 此方法覆盖HTTP请求返回数据头"Content-Type"字段值中包含的IMIE类型，如果设置的MIME类型无效则继续使用"Content-Type"字段值中包含的IMIE类型。
    *     如果MIME类型中指定了字符集类型（charset），则需按照指定的字符集类型对接收到的数据体（respose）进行处理，否则默认为UTF-8字符集。
    *     注意：此方法需在send方法前调用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  def overrideMimeType(): Unit = js.native
  def overrideMimeType(mime: String): Unit = js.native
  /**
    * 发送HTTP请求
    * 此方法触发HTTP请求发送，如果之前没有调用open()，或者更具体地说，如果readyState不是1，send()抛出一个异常。否则，将发送HTTP请求，该请求由以下几部分组成：    
    *     之前调用open()时指定的HTTP方法、URL；
    *     之前调用setRequestHeader()时指定的请求头部（如果有的话）；
    *     传递给这个方法的body参数。
    *     一旦请求发送了，send()把readyState设置为2，并触发onreadystatechange事件；
    *     如果服务器响应带有一个HTTP重定向，send()方法在后台线程自动遵从重定向；
    *     当所有的HTTP响应头部已经接收，send()或后台线程把readyState设置为3并触发onreadystatechange事件；
    *     如果响应较长，send()或后台线程可能在状态3中触发多次onreadystatechange事件；
    *     最后，当响应完成，send()或后台线程把readyState设置为4，并最后一次触发onreadystatechange事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  def send(): Unit = js.native
  def send(body: String): Unit = js.native
  /**
    * 指定一个HTTP请求的Header
    * Http的Header应该包含在通过后续send()调用而发起的请求中。
    *     此方法只有当readyState为1的时候才能调用，例如，在调用了open()之后，但在调用send()之前。
    *     如果带有指定名称的头部已经被指定了，这个头部的新值就是：之前指定的值，加上逗号、以及这个调用指定的值（形成一个数组）。
    *     如果Web服务器已经保存了和传递给open()的URL相关联的cookie，适当的Cookie或Cookie2头部也自动地包含到请求中，可以通过调用setRequestHeader()来把这些cookie添加到头部。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  def setRequestHeader(): Unit = js.native
  def setRequestHeader(headerName: String): Unit = js.native
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

