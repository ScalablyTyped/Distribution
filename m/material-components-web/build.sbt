organization := "org.scalablytyped"
name := "material-components-web"
version := "3.2.0-fa3a7d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-43951f",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-245800",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20191126Z-6ea55a",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20191126Z-364950",
  "org.scalablytyped" %%% "material__data-table" % "3.2.0-b944d5",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20191126Z-6b8465",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20191126Z-9b675b",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-05276f",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20191126Z-2516c6",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20191126Z-b355ca",
  "org.scalablytyped" %%% "material__icon-button" % "3.2.0-b0c5c5",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-a315c8",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20191126Z-14723b",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20191126Z-21a6b5",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20191126Z-b90229",
  "org.scalablytyped" %%% "material__menu-surface" % "3.2.0-d7a702",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-bce247",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20191126Z-a9ac44",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-44e558",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20191126Z-7245a5",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-530748",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20191126Z-d2c755",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20191126Z-f15ded",
  "org.scalablytyped" %%% "material__switch" % "3.2.0-3a1212",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20191126Z-01dfe8",
  "org.scalablytyped" %%% "material__tab-bar" % "3.2.0-8a5356",
  "org.scalablytyped" %%% "material__tab-indicator" % "3.1.0-998b4a",
  "org.scalablytyped" %%% "material__tab-scroller" % "3.2.0-a6f505",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20191126Z-be2bba",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20191126Z-2f4c2e",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        