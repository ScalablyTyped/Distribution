
# Scala.js typings for koa-csrf

Typings are for version 3.0

## Library description:
CSRF tokens for Koa

|                    |                 |
| ------------------ | :-------------: |
| Full name          | koa-csrf |
| Keywords           | cross, csrf, forgery, koa, koa2, koa@2, koa@next, koanext, next, request, security, site |
| # releases         | 3 |
| # dependents       | 52 |
| # downloads        | 120428 |
| # stars            | 12 |

## Links
- [Homepage](https://github.com/koajs/csrf)
- [Bugs](https://github.com/koajs/csrf/issues)
- [Repository](https://github.com/koajs/csrf)
- [Npm](https://www.npmjs.com/package/koa-csrf)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for koa-csrf 3.0
// Project: https://github.com/koajs/csrf
// Definitions by: Haskaalo <https://github.com/haskaalo>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.3
/* =================== USAGE ===================
import * as koaCsrf from 'koa-csrf';
import * as Koa from "koa";
const app = new Koa();

app.use(new koaCsrf({
    invalidSessionSecretMessage: 'Invalid session secret',
    invalidSessionSecretStatusCode: 403,
    invalidTokenMessage: 'Invalid CSRF token',
    invalidTokenStatusCode: 403,
    excludedMethods: [ 'GET', 'HEAD', 'OPTIONS' ],
    disableQuery: false
}));
 =============================================== */


```

