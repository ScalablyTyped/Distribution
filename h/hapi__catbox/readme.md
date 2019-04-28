
# Scala.js typings for hapi__catbox

Typings are for version 10.2

## Library description:
Multi-strategy object caching service

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @hapi/catbox |
| Keywords           | cache, generic, adapter |
| # releases         | 4 |
| # dependents       | 2 |
| # downloads        | 3573 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/hapijs/catbox#readme)
- [Bugs](https://github.com/hapijs/catbox/issues)
- [Repository](https://github.com/hapijs/catbox)
- [Npm](https://www.npmjs.com/package/%40hapi%2Fcatbox)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for @hapi/catbox 10.2
// Project: https://github.com/hapijs/catbox
// Definitions by: Jason Swearingen <https://github.com/jasonswearingen>
//                 AJP <https://github.com/AJamesPhillips>
//                 Rodrigo Saboya <https://github.com/saboya>
//                 Silas Rech <https://github.com/lenovouser>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/**
 * Client
 * The Client object provides a low-level cache abstraction. The object is constructed using new Client(engine, options) where:
 * engine - is an object or a prototype function implementing the cache strategy:
 *  * function - a prototype function with the signature function(options). catbox will call new func(options).
 *  * object - a pre instantiated client implementation object. Does not support passing options.
 * options - the strategy configuration object. Each strategy defines its own configuration options with the following common options:
 *  * partition - the partition name used to isolate the cached results across multiple clients. The partition name is used as the MongoDB database name,
 *    the Riak bucket, or as a key prefix in Redis and Memcached. To share the cache across multiple clients, use the same partition name.
 * @see {@link https://github.com/hapijs/catbox#client}
 */

```

