
# Scala.js typings for koa-views

Typings are for version 2.x

## Library description:
Template rendering middleware for koa

|                    |                 |
| ------------------ | :-------------: |
| Full name          | koa-views |
| Keywords           | koa, render, views, app-wide, templating, templates |
| # releases         | 8 |
| # dependents       | 187 |
| # downloads        | 402130 |
| # stars            | 13 |

## Links
- [Homepage](https://github.com/queckezz/koa-views#readme)
- [Bugs](https://github.com/queckezz/koa-views/issues)
- [Repository](https://github.com/queckezz/koa-views)
- [Npm](https://www.npmjs.com/package/koa-views)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for koa-views 2.x
// Project: https://github.com/queckezz/koa-views
// Definitions by: Alex Friedman <https://github.com/brooklyndev>
// Definitions: https://github.com/brooklyndev/DefinitelyTyped
// TypeScript Version: 2.3
/* =================== USAGE ===================

    import * as Koa from 'koa';
    import * as views from 'koa-views';

    const app = new Koa();
    app.use(views(__dirname + '/views', {
        map: {
            html: 'underscore'
        }
    }));

    app.use(async function (ctx, next) {
        await ctx.render('user', {
            user: 'John'
        });
    });

 =============================================== */


```

