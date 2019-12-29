organization := "org.scalablytyped"
name := "material-components-web"
version := "3.2.0-6242f7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-2af757",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-fa4047",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20191126Z-523ae3",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20191126Z-181965",
  "org.scalablytyped" %%% "material__data-table" % "3.2.0-50f0ec",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20191126Z-057e60",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20191126Z-24644e",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-e3988b",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20191126Z-a53f78",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20191126Z-a02ebe",
  "org.scalablytyped" %%% "material__icon-button" % "3.2.0-04eaf0",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-32e2b1",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20191126Z-e5d0a7",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20191126Z-b87ac0",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20191126Z-15a086",
  "org.scalablytyped" %%% "material__menu-surface" % "3.2.0-6e4bb0",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-2898b2",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20191126Z-15349a",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-e13bc5",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20191126Z-133614",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-848e89",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20191126Z-a34048",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20191126Z-5047b0",
  "org.scalablytyped" %%% "material__switch" % "3.2.0-96eb0c",
  "org.scalablytyped" %%% "material__tab" % "0.35-dt-20191126Z-46286b",
  "org.scalablytyped" %%% "material__tab-bar" % "3.2.0-36631c",
  "org.scalablytyped" %%% "material__tab-indicator" % "3.1.0-e18aa5",
  "org.scalablytyped" %%% "material__tab-scroller" % "3.2.0-baca83",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20191126Z-047568",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20191126Z-4c1452",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        