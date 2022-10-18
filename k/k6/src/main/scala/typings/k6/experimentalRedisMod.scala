package typings.k6

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalRedisMod {
  
  @JSImport("k6/experimental/redis", "Client")
  @js.native
  open class Client protected () extends StObject {
    /**
      * Instantiate a new Redis client.
      *
      * @param options - Options.
      * @returns instantiated Client
      */
    def this(options: Options) = this()
    
    /**
      * Decrements the numerical value stored at key by one.
      *
      * If the key does not exist, it is set to 0 before performing the operation.
      * If the key exists but cannot be treated as a number, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-decr
      *
      * @param key - key to decrement the value of
      * @returns a promise that resolves to the value of the key after the decrement.
      */
    def decr(key: String): js.Promise[Double] = js.native
    
    /**
      * Decrements the numerical value stored at key by the provided decrement.
      *
      * If the key does not exist, it is set to 0 before performing the operation.
      * If the key exists but cannot be treated as a number, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-decrby
      *
      * @param key - key to decrement the value of
      * @param decrement - amount to decrement the value of the key by
      * @returns a promise that resolves to the value of the key after the decrement.
      */
    def decrBy(key: String, decrement: Double): js.Promise[Double] = js.native
    
    /**
      * Removes the specified keys.
      *
      * A key is ignored if it does not exist.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-del
      *
      * @param keys - keys to delete
      * @returns a promise that resolves to the number of keys that were removed.
      */
    def del(keys: js.Array[String]): js.Promise[Double] = js.native
    
    /**
      * Returns the number of the provided keys arguments that exist.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-exists
      *
      * @param keys - the keys to check the existence of
      * @returns a promise that resolves to the number of keys that exist.
      */
    def exists(keys: js.Array[String]): js.Promise[Double] = js.native
    
    /**
      * Sets a timeout on a key. After the timeout has expired, the key will automatically be deleted.
      *
      * Calling expire with a non-positive timeout value will result in the being deleted rather
      * than expired.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-expire
      *
      * @param key - key to set the time to live of
      * @param seconds - value to set the time to live of the key to (in seconds)
      * @returns a promise that resolves to true if the operation succeeded, false otherwise.
      */
    def expire(key: String, seconds: Double): js.Promise[Boolean] = js.native
    
    /**
      * Gets the value of a key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-get
      *
      * @param key - key to get
      * @returns a promise that resolves to the value of the key.
      */
    def get(key: String): js.Promise[String] = js.native
    
    /**
      * Get the value of a key and delete it.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-getdel
      *
      * @param key - the key to get and delete
      * @returns a promise that resolves to the value of the key that was deleted.
      */
    def getDel(key: String): js.Promise[String] = js.native
    
    /**
      * Atomically sets the value of a key and returns the value
      * previously stored at that key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-getset
      *
      * @param key - key to get and set
      * @param value - value to set
      * @returns a promise that resolves to the old value of the key.
      */
    def getSet(key: String, value: Any): js.Promise[String] = js.native
    
    /**
      * Deletes the specified fields from the hash stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hdel
      *
      * @param key - key holding the hash to delete the fields of
      * @param fields - fields to delete from the hash
      * @returns a promise that resolves to the number of fields that were deleted.
      */
    def hdel(key: String, fields: js.Array[String]): js.Promise[Double] = js.native
    
    /**
      *
      * Returns the value of the specified hash field.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hget
      *
      * @param key - key holding the hash to get the field's value of
      * @param field - field to get the value of
      * @returns a promise that resolves to the value of the hash field.
      */
    def hget(key: String, field: String): js.Promise[String] = js.native
    
    /**
      * Returns all fields and values of the hash stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hgetall
      *
      * @param key - the key holding the hash to get the fields of
      * @returns a promise that resolves to an object of field/value pairs.
      */
    def hgetall(key: String): js.Promise[StringDictionary[String]] = js.native
    
    /**
      * Increments the numberical value stored at the hash field by the specified amount.
      *
      * If the key does not exist, a new key holding a hash is created.
      * If the field does not exist, it is set to 0 before the operation is performed.
      * If the field does not hold a nummerical value, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hincrby
      *
      * @param key - the key holding the hash to get the number of fields of
      * @param field - the hash's field to increment the value of
      * @param increment - the amount to increment the value by
      * @returns a promise that resolves to the value of the field after the increment.
      */
    def hincrby(key: String, field: String, increment: Double): js.Promise[Double] = js.native
    
    /**
      * Returns all fields of the hash stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hkeys
      *
      * @param key - the key holding the hash to get the fields of
      * @returns a promise that resolves to an array of field names.
      */
    def hkeys(key: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Return the number of fields contained in the hash stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hlen
      *
      * @param key - the key holding the hash to get the number of fields of
      * @returns a promise that resolves to the number of fields in the hash.
      */
    def hlen(key: String): js.Promise[Double] = js.native
    
    /**
      * Sets the value of a hash field to the specified value.
      *
      * If the key does not exist, a new key holding a hash is created.
      * If the field already exists, it is overwritten.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hset
      *
      * @param key - key holding the hash to set the field's value of
      * @param field - field to set the value of
      * @param value - value to set the field to
      * @returns a promise that resolves to the the number of fields that were changed.
      */
    def hset(key: String, field: String, value: String): js.Promise[Double] = js.native
    
    /**
      * Sets the value of a hash field to the specified value, if and only if the field does not yet exist.
      *
      * If the key does not exist, a new key holding a hash is created.
      * If the field already exists, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hsetnx
      *
      * @param key - key holding the hash to set the field's value of
      * @param field - field to set the value of
      * @param value - value to set the field to
      * @returns a promise that resolves to true if the hash field was set, false otherwise.
      */
    def hsetnx(key: String, field: String, value: String): js.Promise[Boolean] = js.native
    
    /**
      * Returns all values of the hash stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-hvals
      *
      * @param key - the key holding the hash to get the fields' values of
      * @returns a promise that resolves to an array of field values.
      */
    def hvals(key: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Increments the numerical value stored at key by one.
      *
      * If the key does not exist, it is set to 0 before performing the operation.
      * If the key exists but cannot be treated as a number, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-incr
      *
      * @param key - key to increment the value of
      * @returns a promise that resolves to the value of the key after the increment.
      */
    def incr(key: String): js.Promise[Double] = js.native
    
    /**
      * Increments the numerical value stored at key by the provided increment.
      *
      * If the key does not exist, it is set to 0 before performing the operation.
      * If the key exists but cannot be treated as a number, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-incrby
      *
      * @param key - key to increment the value of
      * @param increment - amount to increment the value of the key by
      * @returns a promise that resolves to the value of the key after the increment.
      */
    def incrBy(key: String, increment: Double): js.Promise[Double] = js.native
    
    /**
      * Returns the element at the specified in the list stored at key.
      *
      * The offsets are zero-based. These offsets can be negative numbers indicating
      * offsets starting at the end of the list.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-lindex
      *
      * @param key - key holding the list to get the element of
      * @param index - index of the element to get
      * @returns a promise that resolves to the value of the element at the specified index.
      */
    def lindex(key: String, index: Double): js.Promise[String] = js.native
    
    /**
      * Returns the length of the list stored at the key.
      *
      * If the key does not exist, it is interpreted as an empty list and 0 is returned.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-llen
      *
      * @param key - key holding the list to get the length  of
      * @returns a promise that resolves to the length of the list.
      */
    def llen(key: String): js.Promise[Double] = js.native
    
    /**
      * Removes and returns the value at the head of the list stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-lpop
      *
      * @param key - key holding the list to pop the head of
      * @returns a promise that resolves to the value that was popped.
      */
    def lpop(key: String): js.Promise[String] = js.native
    
    /**
      * Prepends values to a list, creating the list if it does not already exist.
      *
      * If the key exists but does not hold a list, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-lpush
      *
      * @param key - key holding the list to prepend to
      * @param values - values to prepend to the list
      * @returns a promise that resolves to the number of elements in the list after the prepend operation.
      */
    def lpsuh(key: String, values: js.Array[Any]): js.Promise[Double] = js.native
    
    /**
      * Returns the elements stored in the list from start to end.
      *
      * The offsets are zero-based. These offsets can be negative numbers indicating
      * offsets starting at the end of the list.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-lrange
      *
      * @param key - key holding the list to get the range of
      * @param start - index of the first element to return
      * @param stop - index of the last element to return
      * @returns a promise that resolves to an array of the values in the specified range.
      */
    def lrange(key: String, start: Double, stop: Double): js.Promise[js.Array[String]] = js.native
    
    /**
      * Removes the first `count` occurrences of `value` from the list stored at `key`.
      *
      *  If the `count` is positive, elements are removed the from head of the list (from left to right)
      * If the `count` is 0, all occurrences of `value` are removed.
      * If the `count` is negative, elements are removed from the tail of the list (from right to left).
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-lrem
      *
      * @param key - key holding the list to remove the element of
      * @param count - the number of elements matching the value to remove
      * @param value - the value to remove
      * @returns a promise that resolves to the number of elements removed.
      */
    def lrem(key: String, count: Double, value: String): js.Promise[Double] = js.native
    
    /**
      * Sets the value of an element in the list stored at key to new value.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-lset
      *
      * @param key - key holding the list to set the element of
      * @param index - index of the element to set
      * @param element - value to set the element to
      * @returns a promise that resolves to the 'OK' string if the operation succeeded
      */
    def lset(key: String, index: Double, element: String): js.Promise[String] = js.native
    
    /**
      * Returns the values of all the specified keys.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-mget
      *
      * @param keys - the keys to get the values of
      * @returns a promise that resolves to an array of the values of the keys.
      */
    def mget(keys: js.Array[String]): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Removes the existing timeout on a key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-persist
      *
      * @param key - the key to remove the timeout of.
      * @returns a promise that resolves to true if the operation succeeded, false otherwise.
      */
    def persist(key: String): js.Promise[Boolean] = js.native
    
    /**
      * Returns a random key from the keyspace.
      *
      * If the database is empty, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-randomkey
      *
      * @returns a promise that resolves to a random key.
      */
    def randomKey(): js.Promise[String] = js.native
    
    /**
      * Removes and returns the value at the tail of the list stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-rpop
      *
      * @param key - key holding the list to pop the tail of
      * @returns a promise that resolves to the value that was popped.
      */
    def rpop(key: String): js.Promise[String] = js.native
    
    /**
      * Appends values to a list, creating the list if it does not already exist.
      *
      * If the key exists but does not hold a list, the returned promise will be rejected.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-rpush
      *
      * @param key - key holding the list to append to
      * @param values - values to append to the list
      * @returns a promise that resolves to the number of elements in the list after the append operation.
      */
    def rpush(key: String, values: js.Array[Any]): js.Promise[Double] = js.native
    
    /**
      * Adds the specified elements to the set stored at key.
      *
      * Specified elements that are already a member of the set are ignored.
      * If the key does not exist, a new set is created before adding the specified elements.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-sadd
      *
      * @param key - the key holding the set to add a member to
      * @param members - the members to add to the set
      * @returns a promise that resolves to the number of members that were added to the set; excluding those that were already present.
      */
    def sadd(key: String, members: js.Array[Any]): js.Promise[Double] = js.native
    
    /**
      * Sets the value of a key, with a time to live (ttl) value equal to
      * the provided expiration.
      *
      * If the key already exists, it is overwritten.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-set
      *
      * @param key - key to set
      * @param value - value to set
      * @param expiration - time to live in seconds. `0` means no expiration.
      * @returns a promise that resolves to "OK" if the operation succeeded.
      */
    def set(key: String, value: Any, expiration: Double): js.Promise[String] = js.native
    
    /**
      * Returns whether or not the specified member is a member of the set stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-sismembers
      *
      * @param key - the key holding the set to check the belonging of
      * @param member - the member to check the belonging of
      * @returns a promise that resolves to true if the member is a member of the set, false otherwise.
      */
    def sismember(key: String, member: Any): js.Promise[Boolean] = js.native
    
    /**
      * Returns the members of the set stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-smembers
      *
      * @param key - the key holding the set to get the members of
      * @returns a promise that resolves to an array of members in the set.
      */
    def smembers(key: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Pops a random member from the set stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-spop
      *
      * @param key - the key holding the set to pop the random member of
      * @returns a promise that resolves to the popped member.
      */
    def spop(key: String): js.Promise[String] = js.native
    
    /**
      * Returns a random member of the set value stored at key.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-srandmember
      *
      * @param key - the key holding the set to get the random member of
      * @returns a promise that resolves to a random member of the set.
      */
    def srandmember(key: String): js.Promise[String] = js.native
    
    /**
      * Removes the specified members from the set stored at key.
      *
      * Specified members that are not a member of this set are ignored.
      * If key does not exist, it is treated as an empty set and this command returns 0.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-srem
      *
      * @param key - the key holding the set to remove a member from
      * @param members - the members to remove from the set
      * @returns a promise that resolves to the number of members that were removed from the set.
      */
    def srem(key: String, members: js.Array[Any]): js.Promise[Double] = js.native
    
    /**
      * Returns the remaining time to live of a key that has a timeout.
      *
      * https://k6.io/docs/javascript-api/k6-redis/client/client-ttl
      *
      * @param key - the key to get the time to live of
      * @returns a promise that resolves to the time to live of the key, in seconds.
      */
    def ttl(key: String): js.Promise[Double] = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Array of addresses in the 'host:port' defining which connect Redis to connect to.
      * Supplying a single entry would connect the client to a single Redis instance.
      * Supplying multiple entries would connect the client to a cluster/sentinel nodes.
      */
    var addrs: js.Array[String]
    
    /**
      * The id of the database to be selected after connecting to the server.
      * Only used when connecting to a single-node use.
      */
    var db: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum amount of time to wait for a connection to a Redis server to be established.
      */
    var dialTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The frequency at which the client checks for idle connections in the connection pool.
      * Use `-1` to disable the checks.
      */
    var idleCheckFrequency: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum amount of time the client waits for a connection to become active before timing out.
      */
    var idleTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the master to connect to when connecting to a Redis cluster.
      */
    var masterName: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum amount of time a connection can be idle in the connection pool before being closed.
      */
    var maxConnAge: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of idle connections to keep open in the connection pool.
      */
    var maxIdleConns: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of retries to attempt when connecting to a Redis server before giving up.
      */
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum amount of time to wait between retries when connecting to a Redis server.
      */
    var maxRetryBackoff: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of idle connections to keep open in the connection pool.
      */
    var minIdleConns: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum amount of time to wait between retries when connecting to a Redis server.
      */
    var minRetryBackoff: js.UndefOr[Double] = js.undefined
    
    /**
      * Password to authenticate the client connection with.
      */
    var password: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of socket connections to keep open in the connection pool.
      */
    var poolSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum amount of time to wait for a connection to the Redis server to be returned from the pool.
      */
    var poolTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum amount of time to wait for socket reads to succeed.
      * Use `-1` for no timeout.
      */
    var readTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Password to authenticate the client connection with when connecting to a sentinel.
      */
    var sentinelPassword: js.UndefOr[Double] = js.undefined
    
    /**
      * Username to authenticate the client connection with when connecting to a sentinel.
      */
    var sentinelUsername: js.UndefOr[Double] = js.undefined
    
    /**
      * Username to authenticate the client connection with.
      */
    var username: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum amount of time to wait for a socket write to succeed.
      * Use `-1` for no timeout.
      */
    var writeTimeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(addrs: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddrs(value: js.Array[String]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
      
      inline def setAddrsVarargs(value: String*): Self = StObject.set(x, "addrs", js.Array(value*))
      
      inline def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setDialTimeout(value: Double): Self = StObject.set(x, "dialTimeout", value.asInstanceOf[js.Any])
      
      inline def setDialTimeoutUndefined: Self = StObject.set(x, "dialTimeout", js.undefined)
      
      inline def setIdleCheckFrequency(value: Double): Self = StObject.set(x, "idleCheckFrequency", value.asInstanceOf[js.Any])
      
      inline def setIdleCheckFrequencyUndefined: Self = StObject.set(x, "idleCheckFrequency", js.undefined)
      
      inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setMasterName(value: Double): Self = StObject.set(x, "masterName", value.asInstanceOf[js.Any])
      
      inline def setMasterNameUndefined: Self = StObject.set(x, "masterName", js.undefined)
      
      inline def setMaxConnAge(value: Double): Self = StObject.set(x, "maxConnAge", value.asInstanceOf[js.Any])
      
      inline def setMaxConnAgeUndefined: Self = StObject.set(x, "maxConnAge", js.undefined)
      
      inline def setMaxIdleConns(value: Double): Self = StObject.set(x, "maxIdleConns", value.asInstanceOf[js.Any])
      
      inline def setMaxIdleConnsUndefined: Self = StObject.set(x, "maxIdleConns", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMaxRetryBackoff(value: Double): Self = StObject.set(x, "maxRetryBackoff", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryBackoffUndefined: Self = StObject.set(x, "maxRetryBackoff", js.undefined)
      
      inline def setMinIdleConns(value: Double): Self = StObject.set(x, "minIdleConns", value.asInstanceOf[js.Any])
      
      inline def setMinIdleConnsUndefined: Self = StObject.set(x, "minIdleConns", js.undefined)
      
      inline def setMinRetryBackoff(value: Double): Self = StObject.set(x, "minRetryBackoff", value.asInstanceOf[js.Any])
      
      inline def setMinRetryBackoffUndefined: Self = StObject.set(x, "minRetryBackoff", js.undefined)
      
      inline def setPassword(value: Double): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      inline def setPoolTimeout(value: Double): Self = StObject.set(x, "poolTimeout", value.asInstanceOf[js.Any])
      
      inline def setPoolTimeoutUndefined: Self = StObject.set(x, "poolTimeout", js.undefined)
      
      inline def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
      
      inline def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
      
      inline def setSentinelPassword(value: Double): Self = StObject.set(x, "sentinelPassword", value.asInstanceOf[js.Any])
      
      inline def setSentinelPasswordUndefined: Self = StObject.set(x, "sentinelPassword", js.undefined)
      
      inline def setSentinelUsername(value: Double): Self = StObject.set(x, "sentinelUsername", value.asInstanceOf[js.Any])
      
      inline def setSentinelUsernameUndefined: Self = StObject.set(x, "sentinelUsername", js.undefined)
      
      inline def setUsername(value: Double): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWriteTimeout(value: Double): Self = StObject.set(x, "writeTimeout", value.asInstanceOf[js.Any])
      
      inline def setWriteTimeoutUndefined: Self = StObject.set(x, "writeTimeout", js.undefined)
    }
  }
}
