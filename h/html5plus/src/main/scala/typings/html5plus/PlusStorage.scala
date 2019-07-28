package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Storage模块管理应用本地数据存储区，用于应用数据的保存和读取。应用本地数据与localStorage、sessionStorage的区别在于数据有效域不同，前者可在应用内跨域操作，数据存储期是持久化的，并且没有容量限制。通过plus.storage可获取应用本地数据管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/storage.html](http://www.html5plus.org/doc/zh_cn/storage.html)
  */
@js.native
trait PlusStorage extends js.Object {
  /**
    * 清除应用所有的键值对存储数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/storage.html](http://www.html5plus.org/doc/zh_cn/storage.html)
    */
  def clear(): Unit = js.native
  /**
    * 通过键(key)检索获取应用存储的值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/storage.html](http://www.html5plus.org/doc/zh_cn/storage.html)
    */
  def getItem(): String = js.native
  def getItem(key: String): String = js.native
  /**
    * 获取应用存储区中保存的键值对的个数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/storage.html](http://www.html5plus.org/doc/zh_cn/storage.html)
    */
  def getLength(): Double = js.native
  /**
    * 获取键值对中指定索引值的key值
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/storage.html](http://www.html5plus.org/doc/zh_cn/storage.html)
    */
  def key(): Unit = js.native
  def key(index: Double): Unit = js.native
  /**
    * 通过key值删除键值对存储的数据
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/storage.html](http://www.html5plus.org/doc/zh_cn/storage.html)
    */
  def removeItem(): Unit = js.native
  def removeItem(key: String): Unit = js.native
  /**
    * 修改或添加键值(key-value)对数据到应用数据存储中
    * 如果设置的键在应用数据存储中已经存在，更新存储的键值。
    * 	存储的键和值没有容量限制，但过多的数据量会导致效率降低，建议单个键值数据不要超过10Kb。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/storage.html](http://www.html5plus.org/doc/zh_cn/storage.html)
    */
  def setItem(): Unit = js.native
  def setItem(key: String): Unit = js.native
  def setItem(key: String, value: String): Unit = js.native
}

